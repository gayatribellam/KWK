# mytwitterbot.py
# IAE 101, Fall 2019
# Project 02 - Building a Twitterbot
# Name: Gayatri Bellam      
# netid: gbellam     
# Student ID: 112809003

import sys
import simple_twit
import random
def main():
    # This call to simple_twit.create_api will create the api object that
    # Tweepy needs in order to make authenticated requests to Twitter's API.
    # Do not remove or change this function call.
    # Pass the variable "api" holding this Tweepy API object as the first
    # argument to simple_twit functions.
    api = simple_twit.create_api()
    Images = ["pete.jpg","petedebate.jpg","pd1.jpg","p4.jpg","p5.jpg"]
    PeteQuotes = ["Greatness will come by looking forward - untethered from the politics of the past and anchored by our shared values - and by changing our nation's future.",
                 "I think that policy matters. I'm a policy guy. #WinTheEra https://peteforamerica.com/issues/",
                  "So much of politics is about people's relationships with themselves. You do better if you make people feel secure in who they are. https://peteforamerica.com/issues/"]
    TopCandidates = ["@DonaldTrump", "@PeteButtigieg", "BernieSanders" , "@ewarren", "@JoeBiden"]
    Replies = ["#VoteBlue #VoteBlueNoMatterWho", "#NeverTrump #VoteDemocrat because the country needs to fix the messes of Trump", "Support Democrats. Check out https://democrats.org/"]
    replyCounter = 0
    # YOUR CODE BEGINS HERE
    tweets = simple_twit.get_home_timeline(api, 10)
    topCandidate = False
    for tweet in tweets:
        #print("Tweet:", i)
        print("ID:", tweet.id)
        print("Author:", tweet.author.screen_name, ":", tweet.author.name)
        print(tweet.full_text)
        if replyCounter < 4:
            for c in TopCandidates:
                if c == tweet.author.screen_name:
                    topCandidate = True
            simple_twit.send_reply_tweet(api,tweet.author.screen_name + Replies[random.randint(0,len(Replies)-1)], tweet.id)
            if topCandidate == True and tweet.author.screen_name == TopCandidates[1]:
                simple_twit.send_reply_tweet(api,tweet.author.screen_name + "He will make a great President. Check out his policies at https://peteforamerica.com/issues/", tweet.id)
            if topCandidate == True and tweet.author.screen_name == TopCandidates[0]:
                simple_twit.send_reply_tweet(api, "@realDonaldTrump You disgraced our country with your behavior, not Democrats #VoteBlueNoMatterWho" , tweet.id)
            replyCounter+=1
        print ("Verified Account:", tweet.author.verified)
        print()
        topCandidate = False
    Tweets = simple_twit.get_user_timeline (api, "@PeteButtigieg", 3)
    for tweet in Tweets:
        simple_twit.retweet(api, tweet.id)

    #sys.exit()

    #tweets = simple_twit.get_home_timeline(api, 10)
    me = simple_twit.get_user(api, "@gbellam_IAE101")
    print(me.followers_count)
    print(me.description)
    print(me.location)
    simple_twit.version()

    #follow back users and unfollow former candidates
    followers = simple_twit.get_my_followers(api, 4)
    for follower in followers:
        simple_twit.follow_user(api, follower.name)
    simple_twit.unfollow_user(api,"@kamalaharris")  
    simple_twit.unfollow_user(api,"@GovernorBullock") 
    #index = random.randint(0,len(Images)-1_
    simple_twit.send_media_tweet(api,PeteQuotes[random.randint(0,len(PeteQuotes)-1)], Images[random.randint(0,len(Images)-1)])
    
    #t = simple_twit.get_home_timeline(api, 10)

if __name__ == "__main__":
       main()
