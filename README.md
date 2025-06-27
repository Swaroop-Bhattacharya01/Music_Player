# 🎵 Java Music Player

A simple command-line based **Java Music Player** that allows users to play `.wav` audio files using basic keyboard input.

---

## 📂 Project Structure

music_player/
├── Ran During Time - Freedom Trail Studio.wav
└── music_player.java

---

## 🚀 Features

- 🎧 Play `.wav` audio files  
- ⏹️ Stop playback  
- 🔁 Reset (rewind) the track  
- ❌ Quit the player  
- 🧭 Text-based command-line control  

---

## 🛠️ Requirements

- Java 8 or higher  
- `.wav` audio file (must be uncompressed PCM)  
- Terminal / Command Prompt  

---

 🧑‍💻 How to Run

🔹 1. Compile:

```bash
javac music_player.java
🔹 2. Run:
java music_player

**SAMPLE OUTPUT**
Press P to play, S to stop, R to reset, Q to quit
> P
[Music starts playing...]
> S
[Music stops...]
> R
[Music rewinds...]
> Q
[Player closes]

📄 Notes
This program only supports .wav format audio files.

The audio file must be present in the same folder as music_player.java.

Uses the javax.sound.sampled API for audio functionality.

Does not currently support MP3 or GUI.
