package br.edu.ifsp.poo.aula04;

public class Principal {
    public static void main(String[] args) {
        UserAccount poster = new UserAccount("hater",  "poster@ifsp.edu.br");

        UserAccount follower1 = new UserAccount("Fan 1", "fan1@ifsp.edu.br");
        UserAccount follower2 = new UserAccount("Fan 2", "fan2@ifsp.edu.br");
        UserAccount follower3 = new UserAccount("Fan 3", "fan3@ifsp.edu.br");

        System.out.println("Poster posta o primeiro post");
        poster.publish("Palmeiras não tem mundial");
        System.out.println(poster.showMyPosts());


        poster.acceptFollower(follower1);


        System.out.println("Poster posta o segundo post");
        poster.publish("Corinthians não vai jogar hoje!");
        System.out.println(poster.showMyPosts());

        System.out.println("Follower do Poster após adicionar Fan1");
        System.out.println(poster.showMyFollowers());

        System.out.println("Listas do follower 1");
        System.out.println(follower1.showTimeline());
        System.out.println(follower1.showMyFollowers());
        System.out.println(follower1.showMyPosts());

        poster.blockFollower(follower1);
        poster.publish("Vai curthia");
        System.out.println("Posts do Poster");
        System.out.println(poster.showMyPosts());
        System.out.println("Timeline do fan 1");
        System.out.println(follower1.showTimeline());

        poster.acceptFollower(follower2);

        for (int i = 0; i < 10; i++) {
            poster.publish("Test " + i);
        }
        System.out.println("teste de 10 postagens");
        System.out.println(follower2.showTimeline());

        poster.publish("Novo post 1");
        poster.publish("Novo post 2");
        System.out.println("Teste de mais dois posts");
        System.out.println(follower2.showTimeline());




    }


}
