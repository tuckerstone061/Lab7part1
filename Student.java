

package part1;

/**
 *
 * @author Tucker Stone
 * @version Oct 15, 2014
 */
class Student
{
  private String SID;    // ID number
  private String name;
  /**
  * Create a student with default settings for detail information.
  */
  Student()
  {
    SID = "(unknown ID)";
    name = "No Name";
  }
  /**
  * Create a student with given name, year of birth and student ID
  */
  Student(String name, String studentID)
  {
    SID = studentID;
    this.name = name;
  }
  /**
  * Return the student ID of this student.
  */
  public String getStudentID()
  {
    return this.SID;
  }
  /**
  * Set a new name for this person.
  */
  public void setName(String name)
  {
    this.name = name;
  }
  /**
  * Return the name of this person.
  */
  public String getName()
  {
    return this.name;
  }
  /**
  * Return a string representation of this object.
  */
  public String toString()
  {
    return "Student: "+ name +"\n" +
    "Student ID: " + SID + "\n";
  }
  
}