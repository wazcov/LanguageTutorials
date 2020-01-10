import time
import urllib.request
import json
import ssl
import argparse

lyricProviderURL = "https://api.musixmatch.com/ws/1.1/matcher.lyrics.get?apikey=5ba7898997781628910eb372f21687a7&format=json&page_size=1&page=1&q_artist={0}&q_track={1}"

def main():
    t = time.localtime(time.time())

    parser = argparse.ArgumentParser()
    parser.add_argument("--artist", "-a", required=True)
    parser.add_argument("--song", "-s", required=True)
    parser.add_argument("--filename", "-f", required=True)
    args = parser.parse_args()

    print("Welcome To Lyrics Generator")
    print(time.asctime(t))

    try:
        artist = args.artist.lower()
        print("Artist: " + artist)
    except IndexError:
        print("Error: No artist specified")
        exit()
    
    try:
        song = args.song.lower()
        print("Song: " + song)
    except IndexError:
        print("Error: No song specified")
        exit()

    print("Searching, " + song + " by " + artist)
    filename = args.filename
    printAndLog(searchTrack(artist, song), filename)

def printAndLog(text, filename):
    print(text)
    try:
        file = open(filename+".txt", "w")
        file.write(text)
        file.close
    except Exception as e:
        print("***{0}***{1}".format("Unable To Write To A File", e))

def searchTrack(artist, song):
    lyricUrl = lyricProviderURL.format(artist, song)
    lyricResponse = urllib.request.urlopen(lyricUrl, context=ssl._create_unverified_context())
    lyricJson = lyricResponse.read().decode("utf-8")
    lx = json.loads(lyricJson)
    if lx['message']['header']['status_code'] == 404:
        print("No Lyrics Found")
        exit()
    lyrics = lx["message"]["body"]["lyrics"]["lyrics_body"]
    return(lyrics)

if __name__ == "__main__":
    main()
