import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.List;

public class News {
	int newsId;
	String postedByUser;
	String commentByUser;
	String comment;
	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public void setPostedByUser(String postedByUser) {
		this.postedByUser = postedByUser;
	}
	public String getCommentByUser() {
		return commentByUser;
	}
	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	@Override
	public String toString() {
		return"News[newsId="+newsId+",postedByUser="+postedByUser+",commentByUser="+commentByUser+",comment="+comment+"]";
	}
	
	public static void main(String[] args) {
		ArrayList<News> newsList = new ArrayList<News>();
		newsList.add(new News(1,"Ram","Sham","Vote bamk politics has put the future of our youth in darkness"));
		newsList.add(new News(2,"Sahana","Vidya","Today's news is about Corona"));
		newsList.add(new News(3,"Rashmi","Amulya","Budget 2021 looks helpful and empowering"));
		newsList.add(new News(4,"Ajay","Vijay","2 weeks lockdown imposed in Karnataka from tomorrow"));
		//newsList.add(new News(10,"Pavan","Chaithra","The state Budget is presented by CM"));
		
		newsList.stream().filter(i->i.comment.contains("Budget")).forEach(System.out::println);
		
		System.out.println("--------------------------");
		
		newsList.stream().sorted((i,j)->(i.getCommentByUser()).compareTo(j.getCommentByUser()))
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		System.out.println("--------------------------");
		
		//.max((p1,p2)->(
			//return(int)( p1.getNewsCommentByUser()).compareTo(p2.getNewsCommentByUser())).get().getNewsCommentByUser());
		

		Comparator<News> comparator = Comparator.comparing(News::getComment);
		
		News minObject = newsList.stream().min(comparator).get();
		
		News maxObject = newsList.stream().max(comparator).get();
		System.out.println("minobject=" + minObject);
		System.out.println("maxobject=" + maxObject);
		
		System.out.println("--------------------------");
		
		
		Comparator<News> comparator1 = Comparator.comparing(News::getComment);
		News maxObject1 = newsList.stream().max(comparator).get();
		System.out.println("maxobject=" + maxObject);
		
}
}
