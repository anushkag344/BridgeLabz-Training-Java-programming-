package com.library.school.model;

public class ReadingChallenge {

    private String challengeName;
    private int targetBookCount;
    private String rewardBadge;

    public ReadingChallenge(String challengeName,
                            int targetBookCount,
                            String rewardBadge) {

        this.challengeName = challengeName;
        this.targetBookCount = targetBookCount;
        this.rewardBadge = rewardBadge;
    }

    public String getChallengeName() {
        return challengeName;
    }

    public int getTargetBookCount() {
        return targetBookCount;
    }

    public String getRewardBadge() {
        return rewardBadge;
    }

    public static class Builder {

        private String challengeName;
        private int targetBookCount;
        private String rewardBadge;

        public Builder setChallengeName(String challengeName) {
            this.challengeName = challengeName;
            return this;
        }

        public Builder setTargetBookCount(int targetBookCount) {
            this.targetBookCount = targetBookCount;
            return this;
        }

        public Builder setRewardBadge(String rewardBadge) {
            this.rewardBadge = rewardBadge;
            return this;
        }

        public ReadingChallenge build() {

            return new ReadingChallenge(
                    challengeName,
                    targetBookCount,
                    rewardBadge
            );
        }
    }
}