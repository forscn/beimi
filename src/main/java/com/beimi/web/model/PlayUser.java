package com.beimi.web.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.elasticsearch.annotations.Document;

import com.beimi.util.event.UserEvent;


/**
 * @author jaddy0302 Rivulet User.java 2010-3-17
 * 
 */
@Document(indexName = "beimi", type = "uk_playuser")
@Entity
@Table(name = "bm_playuser")
@org.hibernate.annotations.Proxy(lazy = false)
public class PlayUser implements UserEvent , java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
    @Id
	private String id ;
	
	private String username ;
	private String password ;
	private String email ;
	private String uname ;
	private String firstname ;
	private String midname ;
	private String lastname ;
	private String language ;
	private String jobtitle ;
	private String gender;
	private String mobile ;
	private String birthday ;
	private String nickname ;
	private String secureconf = "5";
	private String usertype ; //
	
	private String orgi ;
	private String creater;
	private Date createtime = new Date();
	private Date updatetime = new Date();
	private Date passupdatetime = new Date();
	
	private String memo;
	private String city ;	//城市
	private String province ;//省份
	private boolean login ;		//是否登录
	private boolean online ; 	//是否在线
	private String status ;		//
	private boolean datastatus ;//数据状态，是否已删除	
	private boolean headimg ; 	//是否上传头像
	
	private String playerlevel ;//玩家级别 ， 等级
	private int experience  ;	//玩家经验
	private boolean secquestion ;//是否设置密保问题
	
	
	
	private Date lastlogintime = new Date();	//最后登录时间
	
	private int fans ;			//粉丝
	private int follows ;		//关注
	private int integral ;		//积分

	
	/**
	 * @return the id
	 */
	@Id
	@Column(length = 32)
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "assigned")	
	public String getId() {
		return id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUname() {
		return uname;
	}


	public void setUname(String uname) {
		this.uname = uname;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getMidname() {
		return midname;
	}


	public void setMidname(String midname) {
		this.midname = midname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}


	public String getJobtitle() {
		return jobtitle;
	}


	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getBirthday() {
		return birthday;
	}


	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public String getSecureconf() {
		return secureconf;
	}


	public void setSecureconf(String secureconf) {
		this.secureconf = secureconf;
	}


	public String getUsertype() {
		return usertype;
	}


	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}


	public String getOrgi() {
		return orgi;
	}


	public void setOrgi(String orgi) {
		this.orgi = orgi;
	}


	public String getCreater() {
		return creater;
	}


	public void setCreater(String creater) {
		this.creater = creater;
	}


	public Date getCreatetime() {
		return createtime;
	}


	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}


	public Date getPassupdatetime() {
		return passupdatetime;
	}


	public void setPassupdatetime(Date passupdatetime) {
		this.passupdatetime = passupdatetime;
	}


	public Date getUpdatetime() {
		return updatetime;
	}


	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}


	public String getMemo() {
		return memo;
	}


	public void setMemo(String memo) {
		this.memo = memo;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getProvince() {
		return province;
	}


	public void setProvince(String province) {
		this.province = province;
	}


	public boolean isLogin() {
		return login;
	}


	public void setLogin(boolean login) {
		this.login = login;
	}


	public boolean isOnline() {
		return online;
	}


	public void setOnline(boolean online) {
		this.online = online;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public boolean isDatastatus() {
		return datastatus;
	}


	public void setDatastatus(boolean datastatus) {
		this.datastatus = datastatus;
	}


	public boolean isHeadimg() {
		return headimg;
	}


	public void setHeadimg(boolean headimg) {
		this.headimg = headimg;
	}


	public String getPlayerlevel() {
		return playerlevel;
	}


	public void setPlayerlevel(String playerlevel) {
		this.playerlevel = playerlevel;
	}


	public int getExperience() {
		return experience;
	}


	public void setExperience(int experience) {
		this.experience = experience;
	}


	public boolean isSecquestion() {
		return secquestion;
	}


	public void setSecquestion(boolean secquestion) {
		this.secquestion = secquestion;
	}


	public Date getLastlogintime() {
		return lastlogintime;
	}


	public void setLastlogintime(Date lastlogintime) {
		this.lastlogintime = lastlogintime;
	}


	public int getFans() {
		return fans;
	}


	public void setFans(int fans) {
		this.fans = fans;
	}


	public int getFollows() {
		return follows;
	}


	public void setFollows(int follows) {
		this.follows = follows;
	}


	public int getIntegral() {
		return integral;
	}


	public void setIntegral(int integral) {
		this.integral = integral;
	}


	public void setId(String id) {
		this.id = id;
	}
}
