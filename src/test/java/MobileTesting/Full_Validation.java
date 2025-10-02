package MobileTesting;

import java.util.HashMap;

import org.testng.annotations.Test;

import TestUtils.BaseTest;
import mobile.PageObjects.android.CareerGuidancePage;
import mobile.PageObjects.android.HomePage;
import mobile.PageObjects.android.InternshipPage;
import mobile.PageObjects.android.JobAssistancePage;
import mobile.PageObjects.android.ProfilePage;

public class Full_Validation extends BaseTest{
	
	@Test(dataProvider = "getData")
	public void full_Appication(HashMap<String,String> input) throws InterruptedException{
		
		loginPage.startApp(input.get("Email"), input.get("Password"));
		
		HomePage homePage = new HomePage(driver);
	    homePage.getUserGreeting();
	    homePage.getUserName();
	    homePage.jobCardActivity();
		homePage.internActivity();
		homePage.blogActivity();
		 
		InternshipPage internshipPage = new InternshipPage(driver);
		internshipPage.getIntershipSection();
		internshipPage.lookIntoSummerIntern().replaceAll("\\s+", " ").trim();
	    internshipPage.knowInternDetalis();
        internshipPage.checkEligibility();
        internshipPage.lastActions();
	
        CareerGuidancePage careerGuidancePage = new CareerGuidancePage(driver);
        careerGuidancePage.getIntoCareerGuidanceSection();
   	    careerGuidancePage.goToTodayEvent();
   	    careerGuidancePage.goToRegisterNow();
   	    careerGuidancePage.goToUpcomingEvents();
   	    careerGuidancePage.swipeBigDataImage();
        careerGuidancePage.goToCompleteWebinar();
        careerGuidancePage.swipeUiUxDesignImage();
   	    		
        JobAssistancePage jobPage = new JobAssistancePage(driver);
        jobPage.getIntoJobAssistanceSection();
  	    jobPage.lookingForIndustrals();
  	    jobPage.lookingForIntoEvent();
  		jobPage.lokkingForSummit();
  	    jobPage.LookingForEcvInternation();
  	    jobPage.basicSkillInfo();
  	    jobPage.learnWithoutLimitsInfo();
        jobPage.professionalsInfo();
  	 
        ProfilePage profilePage = new ProfilePage(driver);
        profilePage.goToProfile();
        profilePage.getAccountName();
        profilePage.logOutAction();
 
  		
   	    		
		
		
}}
