

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CommentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CommentTest
{
    /**
     * Default constructor for test class CommentTest
     */
    public CommentTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
    
    //Question 18
    @Test
    public void testGetAuthor()
    {
        Comment comment1 = new Comment("Chloe", "very good", 5);
        assertEquals("Chloe", comment1.getAuthor());
        assertEquals(5, comment1.getRating());
    }
    
    //Question 18
    @Test
    public void testUpvote()
    {
        Comment comment1 = new Comment("Chloe", "very good", 4);
        comment1.upvote();
        assertEquals(1, comment1.getVoteCount());
    }
    
    //Question 18
    @Test
    public void testDownvote()
    {
        Comment comment1 = new Comment("Chloe", "very good", 4);
        comment1.downvote();
        assertEquals(-1, comment1.getVoteCount());
    }
}


