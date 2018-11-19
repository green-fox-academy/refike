package BlogPost;

import java.util.ArrayList;
import java.util.List;

public class Blog {
    private List<BlogPost> myBlog;

    public Blog() {
        this.myBlog = new ArrayList<>();

    }

    public void add (BlogPost blog) {
        myBlog.add(blog);
    }

    public void delete (int indexnumber){
            myBlog.remove(indexnumber);


    }

    public void update (int indexnumber, BlogPost blogPost) {
        myBlog.set(indexnumber,blogPost);
    }

    @Override
    public String toString() {
        return "Blog{" +
                "myBlog=" + myBlog +
                '}';
    }
}
