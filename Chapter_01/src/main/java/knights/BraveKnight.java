package knights;

import knights.quests.Quest;

public class BraveKnight implements Knight {

    private Quest quest;

    public BraveKnight(Quest quest) {  // Constructor injection
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}
