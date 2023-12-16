package models;

import java.util.LinkedHashMap;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Content {
	private String title;
	private String creationTime;
	private String author;
	private String text;
	private static LinkedHashMap<String, Content> contentsMap = new LinkedHashMap<String, Content>();
	private Icon contentImage = new ImageIcon();
	
	public Content(String title, String creationTime, String author, String text) {
		this.title = title;
		this.creationTime = creationTime;
		this.author = author;
		this.text = text;
		
		contentsMap.put(this.title, this);
		
	}
	

	public static LinkedHashMap<String, Content> getContentsMap() {
		return contentsMap;
	}

	public static void setContentsMap(LinkedHashMap<String, Content> contentsMap) {
		Content.contentsMap = contentsMap;
	}

	public Icon getImage() {
		return contentImage;
	}


	public void setImage(Icon image) {
		this.contentImage = image;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public JPanel convertToPanel() {
		JPanel jp = new JPanel();
		jp.setBorder(new EmptyBorder(5, 5, 5, 5));
		jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));
		JLabel jl = new JLabel();
			
		jl.setText("Author: "+ this.getAuthor()+ " Title: "+ this.getTitle()+ " Creation Time: "+this.getCreationTime() + " Post Text: "+this.getText());
			
		jl.setIcon(this.getImage());
		jp.add(jl);
		return jp;
	}
	}
