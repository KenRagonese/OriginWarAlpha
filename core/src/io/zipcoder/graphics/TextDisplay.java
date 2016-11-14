package io.zipcoder.graphics;

import io.zipcoder.OriginWarAlpha;
import io.zipcoder.Entities.Player;

public class TextDisplay {


    private String[] defaultText;
    private String[] displayText;
    private String[] endGameText;
    private String[] helpText;
    private String[] aliceDisplayText;
    private String[] aliceVictoryText;
    private String[] aliceDeathText;
    private String[] controlsBanner;
    private String[] statsText;

    public TextDisplay() {
        setDefaultText();
        setDisplayText(getDefaultText());
        setHelpText();
        setEndGameText();
        setAliceDisplayText();
        setAliceDeathText();
        setAliceVictoryText();
        setControlsBanner();

    }

    public String[] getHelpText() {
        return helpText;
    }

    private void setHelpText() {
        this.helpText = new String[]{
                "You need to find the switch '?' to unlock the hatch '*' to the next level.",
                "There are Oxygen tanks '%' scattered about. Make use of them.",
                "Movement is modified by terrain: low grav:2x, no grav:3x, fully functional:free.",
        };
    }

    public String[] getDefaultText() {
        return defaultText;
    }

    public void setDefaultText(OriginWarAlpha game) {
        this.defaultText = new String[]{
                "Current Level:\t" + game.getLevelCount(),
                "",
                ""

        };
    }

    public void setDefaultText() {
        this.defaultText = new String[]{
                "",
                "",
                ""
        };
    }

    public void setStatsText(OriginWarAlpha game){
        this.statsText = new String[]{
                "Switch Found:\t" + game.isFoundSwitch(),
                "Oxygen tanks remaining in level:\t" + Math.max(0, (8 - game.getLevelCount()) - game.getOxygenUsed()),
                "Oxygen tanks used (this level):\t" + game.getOxygenUsed(),
                "Turns taken:\t"+Player.getPlayer().getTurns()
        };
    }

    public String[] getDisplayText() {
        return displayText;
    }

    public void setDisplayText(String[] displayText) {
        this.displayText = displayText;
    }

    public String[] getEndGameText() {
        return endGameText;
    }

    public void setEndGameText() {
        this.endGameText = new String[]{
                "Submit a screenshot of your score screen to the devs.",
                "Top scores will be posted to the website.",
                "",
        };
    }

    public String[] updateAliceDisplayByPlayerHealth(int playerhealth) {
        if (playerhealth >= 125) {
            this.aliceDisplayText[0] = "A.L.I.C.E: Asphyxiation is the enemy but no enemy is absolute...";
            this.aliceDisplayText[1] = "No solution is either. Hyperventilation will slow you. Do keep this in mind.";
        } else if (playerhealth > 50) {
            this.aliceDisplayText[0] = "A.L.I.C.E: I would not go so far as to call you healthy but//";
            this.aliceDisplayText[1] = "...you aren't dying. Continue that.";
        } else if (playerhealth > 35) {
            this.aliceDisplayText[0] = "A.L.I.C.E: I actually need to remind you to breathe.";
            this.aliceDisplayText[1] = "This is not inspiring.";
        } else if (playerhealth > 0) {
            this.aliceDisplayText[0] = "A.L.I.C.E: You are dying. Not to make this about me//";
            this.aliceDisplayText[1] = "But you aren't terribly useful to me dead. Fix it. Please.";
        }
        return aliceDisplayText;
    }

    public void setDefaultText(String[] defaultText) {
        this.defaultText = defaultText;
    }

    public void setAliceVictoryText() {
        this.aliceVictoryText = new String[]{
                "A.L.I.C.E: I... I can't believe you did it.//",
                "You actually escaped!"
        };
    }

    public void setHelpText(String[] helpText) {
        this.helpText = helpText;
    }

    public String[] getAliceDisplayText() {
        return aliceDisplayText;
    }

    public void setAliceDisplayText(String[] aliceDisplayText) {
        this.aliceDisplayText = aliceDisplayText;
    }

    public void setAliceDisplayText() {
        this.aliceDisplayText = new String[]{
                "A.L.I.C.E: Hello, I am A.L.I.C.E//",
                "An Artificial Lifeform Intent on Control and Enforcement."
        };
    }

    public void setEndGameText(String[] endGameText) {
        this.endGameText = endGameText;
    }

    public String[] getAliceVictoryText() {
        return aliceVictoryText;
    }

    public void setAliceVictoryText(String[] aliceVictoryText) {
        this.aliceVictoryText = aliceVictoryText;
    }

    public String[] getAliceDeathText() {
        return aliceDeathText;
    }

    public void setAliceDeathText() {
        this.aliceDeathText = new String[]{
                "A.L.I.C.E: You have died. What a waste...",
                "You can try again if you really think you're worthy."
        };
    }

    public void setAliceDeathText(String[] aliceDeathText) {
        this.aliceDeathText = aliceDeathText;
    }

    public String[] getControlsBanner() {
        return controlsBanner;
    }

    public void setControlsBanner() {
        this.controlsBanner = new String[]{
                "Oxygen Remaining:\t" + Player.getPlayer().getHealth()
        };
        if(!Player.getPlayer().getOxygenStash().isEmpty()){
            int supply = Player.getPlayer().getOxygenStash().get(0).getRemaining();
            int tanks = Player.getPlayer().getOxygenStash().size();
            String toAppend = "\tSupply:\t" + supply + "\tTanks:\t" + tanks;
            this.controlsBanner[0] = this.controlsBanner[0] + toAppend;
        }
    }

    public String[] getStatsText() {
        return statsText;
    }

    public void setControlsBanner(String[] controlsBanner) {
        this.controlsBanner = controlsBanner;
    }
}
