
package com.google.code.linkedinapi.schema.impl;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.google.code.linkedinapi.schema.Adapter1;
import com.google.code.linkedinapi.schema.ApiStandardProfileRequest;
import com.google.code.linkedinapi.schema.Connections;
import com.google.code.linkedinapi.schema.Educations;
import com.google.code.linkedinapi.schema.Location;
import com.google.code.linkedinapi.schema.MemberGroups;
import com.google.code.linkedinapi.schema.MemberUrlResources;
import com.google.code.linkedinapi.schema.Person;
import com.google.code.linkedinapi.schema.PersonActivities;
import com.google.code.linkedinapi.schema.Positions;
import com.google.code.linkedinapi.schema.RecommendationsGiven;
import com.google.code.linkedinapi.schema.RecommendationsReceived;
import com.google.code.linkedinapi.schema.RelationToViewer;
import com.google.code.linkedinapi.schema.SiteStandardProfileRequest;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "firstName",
    "lastName",
    "headline",
    "location",
    "industry",
    "connections",
    "currentStatus",
    "distance",
    "currentStatusTimestamp",
    "numRecommenders",
    "relationToViewer",
    "summary",
    "publicProfileUrl",
    "interests",
    "associations",
    "honors",
    "specialties",
    "positions",
    "educations",
    "memberUrlResources",
    "apiStandardProfileRequest",
    "siteStandardProfileRequest",
    "pictureUrl",
    "recommendationsGiven",
    "recommendationsReceived",
    "memberGroups",
    "personActivities"
})
@XmlRootElement(name = "person")
public class PersonImpl
    implements Serializable, Person
{

    private final static long serialVersionUID = 2461660169443089969L;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String id;
    @XmlElement(name = "first-name")
    protected String firstName;
    @XmlElement(name = "last-name")
    protected String lastName;
    protected String headline;
    @XmlElement(type = LocationImpl.class)
    protected LocationImpl location;
    protected String industry;
    @XmlElement(type = ConnectionsImpl.class)
    protected ConnectionsImpl connections;
    @XmlElement(name = "current-status")
    protected String currentStatus;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long distance;
    @XmlElement(name = "current-status-timestamp", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long currentStatusTimestamp;
    @XmlElement(name = "num-recommenders", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    protected Long numRecommenders;
    @XmlElement(name = "relation-to-viewer", type = RelationToViewerImpl.class)
    protected RelationToViewerImpl relationToViewer;
    protected String summary;
    @XmlElement(name = "public-profile-url")
    protected String publicProfileUrl;
    protected String interests;
    protected String associations;
    protected String honors;
    protected String specialties;
    @XmlElement(type = PositionsImpl.class)
    protected PositionsImpl positions;
    @XmlElement(type = EducationsImpl.class)
    protected EducationsImpl educations;
    @XmlElement(name = "member-url-resources", type = MemberUrlResourcesImpl.class)
    protected MemberUrlResourcesImpl memberUrlResources;
    @XmlElement(name = "api-standard-profile-request", type = ApiStandardProfileRequestImpl.class)
    protected ApiStandardProfileRequestImpl apiStandardProfileRequest;
    @XmlElement(name = "site-standard-profile-request", type = SiteStandardProfileRequestImpl.class)
    protected SiteStandardProfileRequestImpl siteStandardProfileRequest;
    @XmlElement(name = "picture-url")
    protected String pictureUrl;
    @XmlElement(name = "recommendations-given", type = RecommendationsGivenImpl.class)
    protected RecommendationsGivenImpl recommendationsGiven;
    @XmlElement(name = "recommendations-received", type = RecommendationsReceivedImpl.class)
    protected RecommendationsReceivedImpl recommendationsReceived;
    @XmlElement(name = "member-groups", type = MemberGroupsImpl.class)
    protected MemberGroupsImpl memberGroups;
    @XmlElement(name = "person-activities", type = PersonActivitiesImpl.class)
    protected PersonActivitiesImpl personActivities;
    @XmlAttribute
    protected String path;

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String value) {
        this.firstName = value;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String value) {
        this.lastName = value;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String value) {
        this.headline = value;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location value) {
        this.location = ((LocationImpl) value);
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String value) {
        this.industry = value;
    }

    public Connections getConnections() {
        return connections;
    }

    public void setConnections(Connections value) {
        this.connections = ((ConnectionsImpl) value);
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String value) {
        this.currentStatus = value;
    }

    public Long getDistance() {
        return distance;
    }

    public void setDistance(Long value) {
        this.distance = value;
    }

    public Long getCurrentStatusTimestamp() {
        return currentStatusTimestamp;
    }

    public void setCurrentStatusTimestamp(Long value) {
        this.currentStatusTimestamp = value;
    }

    public Long getNumRecommenders() {
        return numRecommenders;
    }

    public void setNumRecommenders(Long value) {
        this.numRecommenders = value;
    }

    public RelationToViewer getRelationToViewer() {
        return relationToViewer;
    }

    public void setRelationToViewer(RelationToViewer value) {
        this.relationToViewer = ((RelationToViewerImpl) value);
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String value) {
        this.summary = value;
    }

    public String getPublicProfileUrl() {
        return publicProfileUrl;
    }

    public void setPublicProfileUrl(String value) {
        this.publicProfileUrl = value;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String value) {
        this.interests = value;
    }

    public String getAssociations() {
        return associations;
    }

    public void setAssociations(String value) {
        this.associations = value;
    }

    public String getHonors() {
        return honors;
    }

    public void setHonors(String value) {
        this.honors = value;
    }

    public String getSpecialties() {
        return specialties;
    }

    public void setSpecialties(String value) {
        this.specialties = value;
    }

    public Positions getPositions() {
        return positions;
    }

    public void setPositions(Positions value) {
        this.positions = ((PositionsImpl) value);
    }

    public Educations getEducations() {
        return educations;
    }

    public void setEducations(Educations value) {
        this.educations = ((EducationsImpl) value);
    }

    public MemberUrlResources getMemberUrlResources() {
        return memberUrlResources;
    }

    public void setMemberUrlResources(MemberUrlResources value) {
        this.memberUrlResources = ((MemberUrlResourcesImpl) value);
    }

    public ApiStandardProfileRequest getApiStandardProfileRequest() {
        return apiStandardProfileRequest;
    }

    public void setApiStandardProfileRequest(ApiStandardProfileRequest value) {
        this.apiStandardProfileRequest = ((ApiStandardProfileRequestImpl) value);
    }

    public SiteStandardProfileRequest getSiteStandardProfileRequest() {
        return siteStandardProfileRequest;
    }

    public void setSiteStandardProfileRequest(SiteStandardProfileRequest value) {
        this.siteStandardProfileRequest = ((SiteStandardProfileRequestImpl) value);
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String value) {
        this.pictureUrl = value;
    }

    public RecommendationsGiven getRecommendationsGiven() {
        return recommendationsGiven;
    }

    public void setRecommendationsGiven(RecommendationsGiven value) {
        this.recommendationsGiven = ((RecommendationsGivenImpl) value);
    }

    public RecommendationsReceived getRecommendationsReceived() {
        return recommendationsReceived;
    }

    public void setRecommendationsReceived(RecommendationsReceived value) {
        this.recommendationsReceived = ((RecommendationsReceivedImpl) value);
    }

    public MemberGroups getMemberGroups() {
        return memberGroups;
    }

    public void setMemberGroups(MemberGroups value) {
        this.memberGroups = ((MemberGroupsImpl) value);
    }

    public PersonActivities getPersonActivities() {
        return personActivities;
    }

    public void setPersonActivities(PersonActivities value) {
        this.personActivities = ((PersonActivitiesImpl) value);
    }

    public String getPath() {
        return path;
    }

    public void setPath(String value) {
        this.path = value;
    }

}
