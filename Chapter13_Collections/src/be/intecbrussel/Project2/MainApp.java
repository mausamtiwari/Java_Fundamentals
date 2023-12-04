package be.intecbrussel.Project2;

import java.util.*;
import java.util.stream.Collectors;

public class MainApp {
    public static void main(String[] args) {
        // Your cards.
        PostCard belgium = new PostCard("Belgium", "Europe");
        PostCard france = new PostCard("France", "Europe");
        PostCard japan = new PostCard("Japan", "Asia");
        PostCard rdc = new PostCard("Democratic Republic of Congo", "Africa");
        PostCard southKorea = new PostCard("South Korea", "Asia");
        PostCard belgium2 = new PostCard("Belgium", "Europe");
        PostCard southAfrica = new PostCard("South Africa", "Africa");
        PostCard france2 = new PostCard("France", "Europe");
        PostCard belgium3 = new PostCard("Belgium", "Europe");
        PostCard usa = new PostCard("United States of America", "North America");
        PostCard canada = new PostCard("Canada", "North America");
        PostCard peru = new PostCard("Peru", "South America");
        PostCard samoa = new PostCard("Samoa", "Oceania");
        PostCard belgium4 = new PostCard("Belgium", "Europe");
        PostCard france3 = new PostCard("France", "Europe");

        List<PostCard> yourPostCardList = new ArrayList<>();
        yourPostCardList.add(belgium);
        yourPostCardList.add(france);
        yourPostCardList.add(japan);
        yourPostCardList.add(rdc);
        yourPostCardList.add(southKorea);
        yourPostCardList.add(belgium2);
        yourPostCardList.add(southAfrica);
        yourPostCardList.add(france2);
        yourPostCardList.add(belgium3);
        yourPostCardList.add(usa);
        yourPostCardList.add(canada);
        yourPostCardList.add(peru);
        yourPostCardList.add(samoa);
        yourPostCardList.add(belgium4);
        yourPostCardList.add(france3);

        //your friend’s cards
        PostCard northKorea = new PostCard("North Korea", "Asia");
        PostCard usa2 = new PostCard("United States of America", "North America");
        PostCard botswana = new PostCard("Botswana", "Africa");
        PostCard northKorea2 = new PostCard("North Korea", "Asia");

        List<PostCard> yourFriendsPostCardList = new ArrayList<>();
        yourFriendsPostCardList.add(northKorea);
        yourFriendsPostCardList.add(usa2);
        yourFriendsPostCardList.add(botswana);
        yourFriendsPostCardList.add(northKorea2);

        // Opdracht 1
        exchangeCards(yourPostCardList, yourFriendsPostCardList);
        System.out.println("*************************************************************************************");
        System.out.println();

        // Opdracht 2
        sortCardsByCountry(yourPostCardList);
        System.out.println("*************************************************************************************");
        System.out.println();

        // Opdracht 3
        findAndPrintDuplicates(yourPostCardList);
        System.out.println("*************************************************************************************");
        System.out.println();

        // Opdracht 4
        System.out.println("PriorityQueue of Sorted Friends: ");
        sortedFriends();
        System.out.println("*************************************************************************************");
    }

    // Exchanges cards with your friend.
    private static void exchangeCards(List<PostCard> yourCards, List<PostCard> friendCards) {
        // Finds the duplicate in the friendCards List.
        List<PostCard> friendsDuplicates = friendCards.stream()
                .filter(s -> Collections.frequency(friendCards, s) > 1).distinct().toList();

        // Adds the duplicate from friendsCardList to yourCardList to the same index where it was taken from.
        yourCards.addAll(3, friendsDuplicates);

        // Creats a new LinkedHashSet and adds the element to set. This set has only unique elements.
        Set<PostCard> set = new LinkedHashSet<>(friendCards);
        // Clears the list
        friendCards.clear();
        // Adds the elements of set with no duplicates to the list
        friendCards.addAll(set);

        // Gets the first element from yourPosrCardList.
        PostCard card = yourCards
                .stream()
                .findFirst()
                .get();

        // Adds your card to FriendsCardList.
        System.out.println("Friend's card list after exchange:");
        friendCards.add(card);
        System.out.println(friendCards);
        // Removes the card from yourCardList. And Prints your exchanged card List.
        System.out.println("Your card list after exchange:");
        yourCards.remove(0);
        System.out.println(yourCards);
    }

    // Sorts the card by country.
    public static void sortCardsByCountry(List<PostCard> yourPostCardList) {
        Comparator<PostCard> countryComparator = Comparator.comparing(PostCard::getCountry);

        // Sorts yourPostCardList using the comparator
        yourPostCardList.sort(countryComparator);

        // Prints the sorted yourPostCardList
        System.out.println("Your PostCard List sorted by country:");
        System.out.println(yourPostCardList);
    }

    // Finds the number of cards from a specific country. Prints the set of duplicate cards and Unique cards.
    private static void findAndPrintDuplicates(List<PostCard> postCardList) {
        // Creates set of unique cards and duplicate cards
        Set<PostCard> uniqueCards = new HashSet<>();
        Set<PostCard> duplicates = new HashSet<>();

        // Gets the total number of duplicate cards.
        System.out.println("Counting cards by specific number of countries: ");
        Map<String, Long> counterMap = postCardList.stream()
                .collect(Collectors.groupingBy(PostCard::toString, Collectors.counting()));
        System.out.println(counterMap);

        // Checks if the card are duplicate or not, if duplicates adds to duplicate set. Else adds to unique set.
        for (PostCard card : postCardList) {
            int frequency = Collections.frequency(postCardList, card);
            if (frequency > 1) {
                duplicates.add(card);
            } else {
                uniqueCards.add(card);
            }
        }

        System.out.println("Number of Duplicate Cards: " + duplicates.size());

        // Set of duplicate  cards.
        postCardList.addAll(duplicates);
        System.out.println("Duplicate Cards: ");
        System.out.println(duplicates);

        // Unique cards.
        postCardList.addAll(uniqueCards);
        System.out.println("Unique Cards: ");
        System.out.println(uniqueCards);
    }

    // Makes the PriorityQueue called sortedFriends and prioritize your friends based on specific conditions.
    private static void sortedFriends() {
        PriorityQueue<Friend> sortedFriends = new PriorityQueue<>(
                Comparator.comparing(Friend::isFamily).reversed()
                        .thenComparing(Friend::getFriendShipLevel)
                        .thenComparing(Friend::getYearsKnown)
        );

        Friend bobby = new Friend("Bobby", false, 3, 5);
        Friend melissa = new Friend("Melissa", false, 1, 6);
        Friend darla = new Friend("Darla", true, 14, 2);
        Friend bert = new Friend("Bert", false, 10, 4);
        Friend grandma = new Friend("Nana", true, 12, 7);
        Friend fester = new Friend("Fester", false, 1, 2);
        Friend anna = new Friend("Anna", false, 8, 4);

        sortedFriends.offer(bobby);
        sortedFriends.offer(melissa);
        sortedFriends.offer(darla);
        sortedFriends.offer(bert);
        sortedFriends.offer(grandma);
        sortedFriends.offer(fester);
        sortedFriends.offer(anna);

        System.out.println(sortedFriends);
    }
}

