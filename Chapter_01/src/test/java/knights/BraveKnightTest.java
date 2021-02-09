package knights;

import knights.quests.Quest;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class);                // create mock Quest
        BraveKnight knight = new BraveKnight(mockQuest);    // inject mock Quest
        knight.embarkOnQuest();

        verify(mockQuest, times(1)).embark();

    }
}
