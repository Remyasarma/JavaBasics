package com.testcases;

import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

import com.testcases.example.StudentTest;

@Suite
@SelectClasses(value = {StudentTest.class})
//@SelectPackages({"com.testcases.demo","com.testcases.example"})
@SelectPackages({"com.testcases"})
@IncludeTags({"prod","sum"})
//@IncludePackages({"com.testcases.demo.stud"})
//@ExcludePackages({"com.testcases.demo.stud"})
public class AllTests {

}
