# AI Profit 50 – Android APK Projekt v0.3

Dies ist ein **Android-Studio-Projekt** für eine offline nutzbare Android-App mit einer WebView-Oberfläche. Es ist **keine fertig kompilierte APK**. Die APK kann in Android Studio erstellt werden.

## APK erstellen (Windows 11)

1. Android Studio von https://developer.android.com/studio installieren.
2. ZIP entpacken und in Android Studio **Open** → Ordner `AI_Profit_50_Android_APK_Projekt` auswählen.
3. Gradle-Synchronisierung abwarten. Falls Android Studio eine Android SDK Platform 35 oder Build-Tools Installation vorschlägt, bestätigen. Internetzugang ist beim ersten Build nötig.
4. Menü **Build → Build Bundle(s) / APK(s) → Build APK(s)** auswählen.
5. APK unter `app/build/outputs/apk/debug/app-debug.apk` finden und auf das Android-Handy übertragen.
6. APK öffnen; Android kann nach Erlaubnis zur Installation aus dieser Quelle fragen.

## Was funktioniert?

- Eigenständige Android-App, kein Browser oder Hosting nötig
- Spot- und Hebel-Simulationskonten, Start/Pause/Reset, Diagramm, Ereignisprotokoll
- Jeweils 10 € virtuelles Startkapital, 60 € Ziel

## Was funktioniert noch NICHT?

- Keine echte KI oder LM-Studio-Anbindung
- Keine realen Kurse; Zufallsbewegungen statt Börsenhandel
- Keine dauerhafte Speicherung beim App-Neustart
- Keine Echtgeldorders, Auszahlungen oder API-Verbindung
- Hebelmodell ist vereinfacht und kein verlässlicher Liquidations-/Margin-Simulator

**Sicherheit:** Diese Demo hat keine Internet-Berechtigung und kann keine Echtgeldorders auslösen.
