package br.edu.ifsp.poo.aula04;

public class UserAccount {
    private String userName, email;
    private UserAccount[] followers = new UserAccount[100];
    private Post[] posts = new Post[100];
    private Post[] timeline = new Post[10];
    private int numFollowers, numPosts, numPostsTimeline;

    public UserAccount(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    public String showMyPosts(){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < numPosts; i++) {
            builder.append(posts[i].show() + "\n");
        }
        return builder.toString();
    }

    public String showTimeline(){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            if(timeline[i] != null)
                builder.append(timeline[i].show() + "\n");
            else
                break;
        }
        return builder.toString();
    }

    public String showMyFollowers(){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < numFollowers; i++) {
            builder.append(followers[i].getUserName() + "\n");
        }
        return builder.toString();
    }

    public void publish(String quote){
        if(quote != null && !quote.equals("")) {
            Post post = new Post(quote,this);
            posts[numPosts] = post;
            numPosts++;
            for (int i = 0; i < numFollowers; i++) {
                if(followers[i] != null)
                    followers[i].updateTimeline(post);
            }
        }
    }

    public void updateTimeline(Post p){
        int index = numPostsTimeline % 10;
        timeline[index] = p;
        numPostsTimeline ++;
    }

    public void acceptFollower(UserAccount user){
        if(user != null){
            followers[numFollowers] = user;
            numFollowers++;
        }
    }

    public void blockFollower(UserAccount user){
        for (int i = 0; i < numFollowers; i++) {
            if(followers[i] == user){
                followers[i] = null;
                break;
            }
        }
    }

    public void delete(int index){
        if(index >= 0 && index < 100){
            posts[index] = null;
        }
    }

    public void clapPost(int index){
        if(index >= 0 && index < 10 && timeline[index] != null ){
            timeline[index].clap();
        }
    }

    public void booPost(int index){
        if(index >= 0 && timeline[index] != null ){
            timeline[index].boo();
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
