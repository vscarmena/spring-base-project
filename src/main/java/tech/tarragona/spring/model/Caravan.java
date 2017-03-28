package tech.tarragona.spring.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;


@Entity
public class Caravan implements Serializable {
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String brand;
	private String model;
	@Column(name = "construction_year")
	private Integer constructionYear;
	private Integer babys;
	private Integer kids;
	private Integer adults;
	private String name;
	@Size(max = 250)
	private String description;
	
	@Column(name = "what_camping")
	private String whatCamping;
	private boolean insurance;
	@Column(name = "insurance_offer")
	private String insuranceOffer;
	@Column(name = "who_trans")
	private String whoTrans;
	@Column(name = "inf_trans_adress")
	private String infTransAdress;
	@Column(name = "inf_trans_contact")
	private String infTransContact;
	@Column(name = "inf_trans_email")
	private String infTransEmail;
	@Column(name = "inf_trans_name")
	private String infTransName;
	@Column(name = "inf_trans_telephone")
	private Integer infTransTelephone;
	private String recommendation;
	@Column(name = "lenght_stay_date")
	private String lenghtStayDate;
	@Column(name = "lenght_stay_time")
	private Integer lenghtStayTime;
	@Column(name = "reserv_advance_date")
	private String reservAdvanceDate;
	@Column(name = "reserv_advance_time")
	private Integer reservAdvanceTime;
	@Column(name = "availability_date")
	private Integer availabilityDate;
	@Column(name = "availability_time")
	private Integer availabilityTime;


	//bi-directional one-to-one association to Characteristic
	@OneToOne(mappedBy="caravan", cascade = CascadeType.PERSIST)
	private Characteristic characteristic;
	//bi-directional one-to-one association to Rule
	@OneToOne(mappedBy="caravan", cascade = CascadeType.PERSIST)
	private Rule rule;
	//bi-directional one-to-one association to Service
	@OneToOne(mappedBy="caravan", cascade = CascadeType.PERSIST)
	private Service service;

	public Caravan() {
	}
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getAdults() {
		return this.adults;
	}
	public void setAdults(Integer adults) {
		this.adults = adults;
	}
	public Integer getAvailabilityDate() {
		return this.availabilityDate;
	}
	public void setAvailabilityDate(Integer availabilityDate) {
		this.availabilityDate = availabilityDate;
	}
	public Integer getAvailabilityTime() {
		return this.availabilityTime;
	}
	public void setAvailabilityTime(Integer availabilityTime) {
		this.availabilityTime = availabilityTime;
	}
	public Integer getBabys() {
		return this.babys;
	}
	public void setBabys(Integer babys) {
		this.babys = babys;
	}
	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Integer getConstructionYear() {
		return this.constructionYear;
	}
	public void setConstructionYear(Integer constructionYear) {
		this.constructionYear = constructionYear;
	}
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getInfTransAdress() {
		return this.infTransAdress;
	}
	public void setInfTransAdress(String infTransAdress) {
		this.infTransAdress = infTransAdress;
	}
	public String getInfTransContact() {
		return this.infTransContact;
	}
	public void setInfTransContact(String infTransContact) {
		this.infTransContact = infTransContact;
	}
	public String getInfTransEmail() {
		return this.infTransEmail;
	}
	public void setInfTransEmail(String infTransEmail) {
		this.infTransEmail = infTransEmail;
	}
	public String getInfTransName() {
		return this.infTransName;
	}
	public void setInfTransName(String infTransName) {
		this.infTransName = infTransName;
	}
	public Integer getInfTransTelephone() {
		return this.infTransTelephone;
	}
	public void setInfTransTelephone(Integer infTransTelephone) {
		this.infTransTelephone = infTransTelephone;
	}
	public boolean getInsurance() {
		return this.insurance;
	}
	public void setInsurance(boolean insurance) {
		this.insurance = insurance;
	}
	public String getInsuranceOffer() {
		return this.insuranceOffer;
	}
	public void setInsuranceOffer(String insuranceOffer) {
		this.insuranceOffer = insuranceOffer;
	}
	public Integer getKids() {
		return this.kids;
	}
	public void setKids(Integer kids) {
		this.kids = kids;
	}
	public String getLenghtStayDate() {
		return this.lenghtStayDate;
	}
	public void setLenghtStayDate(String lenghtStayDate) {
		this.lenghtStayDate = lenghtStayDate;
	}
	public Integer getLenghtStayTime() {
		return this.lenghtStayTime;
	}
	public void setLenghtStayTime(Integer lenghtStayTime) {
		this.lenghtStayTime = lenghtStayTime;
	}
	public String getModel() {
		return this.model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRecommendation() {
		return this.recommendation;
	}
	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}
	public String getReservAdvanceDate() {
		return this.reservAdvanceDate;
	}
	public void setReservAdvanceDate(String reservAdvanceDate) {
		this.reservAdvanceDate = reservAdvanceDate;
	}
	public Integer getReservAdvanceTime() {
		return this.reservAdvanceTime;
	}
	public void setReservAdvanceTime(Integer reservAdvanceTime) {
		this.reservAdvanceTime = reservAdvanceTime;
	}
	public String getWhatCamping() {
		return this.whatCamping;
	}
	public void setWhatCamping(String whatCamping) {
		this.whatCamping = whatCamping;
	}
	public String getWhoTrans() {
		return this.whoTrans;
	}
	public Characteristic getCharacteristic() {
		return this.characteristic;
	}
	public void setCharacteristic(Characteristic characteristic) {
		this.characteristic = characteristic;
	}
	public Rule getRule() {
		return this.rule;
	}
	public void setRule(Rule rule) {
		this.rule = rule;
	}
	public Service getService() {
		return this.service;
	}
	public void setService(Service service) {
		this.service = service;
	}
}