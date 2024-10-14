package userprofile;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
class ProfileTest
{
  static Profile profileTest;

  @BeforeAll
  static void BeforeAll()
  {
    System.out.println("Before all run");
    // Arrange
    profileTest = new Profile("mann", 7);
    // Other arrange
  }

  @BeforeEach
  void BeforeEach()
  {
    System.out.println("Before each run");
  }


  @AfterEach
  void AfterEach()
  {
    System.out.println("After each run");
  }

  @AfterAll
  static void AfterAll()
  {
    System.out.println("After all run");
  }


  @Test
  void setHeightTestForPositiveValues()
  {

    // Act
    profileTest.setHeight(175);

    //Assert
    assertEquals(175, profileTest.getHeight());

  }

  @Test
  void setHeightTestForNegativeValues()
  {

    // Act
    profileTest.setHeight(175);

    //Assert
    assertEquals(175, profileTest.getHeight());

  }

  @Test
  void setHeightTestForNegativeValuesTwo()
  {

    Profile profileTest2 = new Profile("", 6);
    // Act
    profileTest2.setHeight(175);

    //Assert
    assertEquals(175, profileTest2.getHeight());

  }
}