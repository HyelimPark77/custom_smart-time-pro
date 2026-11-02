package com.szabh.smable3.music;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ServiceInfo;
import android.media.AudioManager;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.MediaSessionManager;
import android.service.notification.NotificationListenerService;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.KeyEvent;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gw0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleMusicControl;
import com.szabh.smable3.entity.MusicAttr;
import com.szabh.smable3.entity.MusicEntity;
import com.szabh.smable3.entity.PlaybackState;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nMusicController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MusicController.kt\ncom/szabh/smable3/music/MusicController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,522:1\n1563#2:523\n1634#2,3:524\n1869#2,2:528\n1563#2:530\n1634#2,3:531\n1563#2:534\n1634#2,3:535\n1#3:527\n*S KotlinDebug\n*F\n+ 1 MusicController.kt\ncom/szabh/smable3/music/MusicController\n*L\n211#1:523\n211#1:524,3\n280#1:528,2\n387#1:530\n387#1:531,3\n81#1:534\n81#1:535,3\n*E\n"})
public final class MusicController extends MusicControllerCompat {

    @aa1
    public static final Companion Companion = null;

    @aa1
    public static final String LOG_HEADER = "MusicController";

    @tb1
    private MediaController curMedia;
    private boolean isOldMusicControl;

    @aa1
    private String lastAlbum;

    @aa1
    private String lastArtist;

    @aa1
    private List<String> lastStateContents;

    @tb1
    private MediaControllerCompat mActiveMediaController;

    @aa1
    private final MusicController$mBleHandleCallback$1 mBleHandleCallback;

    @aa1
    private final MusicController$mCallback$1 mCallback;
    private int mLastVolume;
    private long mLastVolumeTime;

    @tb1
    private MediaSessionManager mMediaSessionManager;
    private ComponentName mNotificationListener;

    @aa1
    private final MediaSessionManager.OnActiveSessionsChangedListener mOnActiveSessionsChangedListener;
    private long tempTime;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        public static final /* synthetic */ String access$getState(Companion r0, PlaybackStateCompat r1) {
            return r0.getState(r1);
        }

        private final String getState(PlaybackStateCompat r2) {
            if (r2 != null) goto L5;
            return "null";
        L5:
            int r3 = r2.getState();
            if (r3 != 1) goto L8;
            return "STATE_STOPPED";
        L8:
            if (r3 != 2) goto L10;
            return "STATE_PAUSED";
        L10:
            if (r3 != 3) goto L12;
            return "STATE_PLAYING";
        L12:
            if (r3 != 4) goto L14;
            return "STATE_FAST_FORWARDING";
        L14:
            if (r3 == 5) goto L17;
            return "OTHER";
        L17:
            return "STATE_REWINDING";
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.szabh.smable3.music.MusicController$mCallback$1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.szabh.smable3.music.MusicController$mBleHandleCallback$1] */
    public MusicController() {
        this.mLastVolume = -1;
        this.mCallback = new MusicController$mCallback$1(this);
        this.mOnActiveSessionsChangedListener = new gw0(this);
        this.mBleHandleCallback = new MusicController$mBleHandleCallback$1(this);
        this.lastStateContents = new ArrayList();
        this.lastArtist = "";
        this.lastAlbum = "";
    }

    public static /* synthetic */ void XIi00iiXO(MusicController r0, List r1) {
        mOnActiveSessionsChangedListener$lambda$0(r0, r1);
    }

    public static final /* synthetic */ void access$autoSwitchActiveController(MusicController r0, List r1, boolean r2) {
        r0.autoSwitchActiveController(r1, r2);
    }

    public static final /* synthetic */ MediaControllerCompat access$getMActiveMediaController$p(MusicController r0) {
        return r0.mActiveMediaController;
    }

    public static final /* synthetic */ MediaSessionManager access$getMMediaSessionManager$p(MusicController r0) {
        return r0.mMediaSessionManager;
    }

    public static final /* synthetic */ ComponentName access$getMNotificationListener$p(MusicController r0) {
        return r0.mNotificationListener;
    }

    public static final /* synthetic */ void access$sendMediaKeyEvent(MusicController r0, int r1) {
        r0.sendMediaKeyEvent(r1);
    }

    private final void assignActiveController(MediaController r5) {
        releaseActiveController();     // Catch: Exception -> L5
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;     // Catch: Exception -> L5
        StringBuilder r1 = new StringBuilder();     // Catch: Exception -> L5
        r1.append("MusicController assignActiveController -> ");     // Catch: Exception -> L5
        MediaMetadataCompat r2 = null;
        if (r5 == null) goto L7;
        String r3 = r5.getPackageName();     // Catch: Exception -> L5
    L8:
        r1.append(r3);     // Catch: Exception -> L5
        r0.XO0O10(r1.toString());     // Catch: Exception -> L5
        if (r5 == null) goto L11;
        MediaSession.Token r6 = r5.getSessionToken();     // Catch: Exception -> L5
    L12:
        MediaControllerCompat r4 = new MediaControllerCompat(getMContext(), MediaSessionCompat.Token.fromToken(r6));     // Catch: Exception -> L5
        this.mActiveMediaController = r4;     // Catch: Exception -> L5
        r4.registerCallback(this.mCallback);     // Catch: Exception -> L5
        MediaControllerCompat r7 = this.mActiveMediaController;     // Catch: Exception -> L5
        if (r7 == null) goto L15;
        PlaybackStateCompat r8 = r7.getPlaybackState();     // Catch: Exception -> L5
    L16:
        if (r8 != null) goto L24;
        MediaControllerCompat r9 = this.mActiveMediaController;     // Catch: Exception -> L5
        if (r9 == null) goto L22;
        PlaybackStateCompat r10 = r9.getPlaybackState();     // Catch: Exception -> L5
        if (r10 == null) goto L22;
        Integer r11 = Integer.valueOf(r10.getState());     // Catch: Exception -> L5
    L23:
        if (r11 != null) goto L24;
        return;
    L22:
        r11 = null;
    L24:
        MediaControllerCompat r12 = this.mActiveMediaController;     // Catch: Exception -> L5
        if (r12 == null) goto L27;
        PlaybackStateCompat r13 = r12.getPlaybackState();     // Catch: Exception -> L5
    L28:
        updatePlaybackState(r13);     // Catch: Exception -> L5
        MediaControllerCompat r14 = this.mActiveMediaController;     // Catch: Exception -> L5
        if (r14 == null) goto L31;
        r2 = r14.getMetadata();     // Catch: Exception -> L5
    L31:
        updateMetadata(r2);     // Catch: Exception -> L5
        return;
    L27:
        r13 = null;
        goto L28
    L15:
        r8 = null;
        goto L16
    L11:
        r6 = null;
        goto L12
    L7:
        r3 = null;
    L5:
        e = move-exception;
        e.printStackTrace();
        i1O0OXO1O.OXO1.XO0O10("MusicController assignActiveController -> error:" + e.getMessage());
    }

    private final void autoSwitchActiveController(List<MediaController> r9, boolean r10) {
        String r1 = null;
        if (r9 != null) goto L5;
    L68:
        if (r10 == false) goto L70;
        releaseActiveController();
    L70:
        this.curMedia = null;
        if (this.isOldMusicControl == true) goto L73;
        String r11 = String.valueOf(PlaybackState.PAUSED.getMState());
        StringCompanionObject r12 = StringCompanionObject.OXO1;
        String r13 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(0.0f)}, 1));
        Intrinsics.O10IXXX0X(r13, "format(...)");
        List r14 = CollectionsKt__CollectionsKt.iXiX011(new String[]{r11, r13, ",0"});
        BleConnector r15 = BleConnector.INSTANCE;
        r15.updateMusic(new BleMusicControl(MusicEntity.PLAYER, MusicAttr.PLAYER_PLAYBACK_INFO, r14));
        MusicEntity r0 = MusicEntity.TRACK;
        r15.updateMusic(new BleMusicControl(r0, MusicAttr.TRACK_ARTIST, " "));
        r15.updateMusic(new BleMusicControl(r0, MusicAttr.TRACK_ALBUM, " "));
        r15.updateMusic(new BleMusicControl(r0, MusicAttr.TRACK_TITLE, " "));
        r15.updateMusic(new BleMusicControl(r0, MusicAttr.TRACK_DURATION, "0"));
    L73:
        this.mLastVolume = -1;
        return;
    L5:
        if (r9.isEmpty() == true) goto L68;
        List<MediaController> r16 = r9;
        Iterator<T> r2 = r16.iterator();
    L9:
        if (r2.hasNext() == false) goto L15;
        Object r3 = r2.next();
        android.media.session.PlaybackState r5 = ((MediaController) r3).getPlaybackState();
        if (r5 == null) goto L9;
        if (r5.getState() != 3) goto L9;
    L16:
        MediaController r4 = (MediaController) r3;
        Iterator<T> r6 = r16.iterator();
    L18:
        if (r6.hasNext() == false) goto L24;
        Object r7 = r6.next();
        android.media.session.PlaybackState r8 = ((MediaController) r7).getPlaybackState();
        if (r8 == null) goto L18;
        if (r8.getState() != 2) goto L18;
    L25:
        MediaController r17 = (MediaController) r7;
        Iterator<T> r18 = r16.iterator();
    L27:
        if (r18.hasNext() == false) goto L33;
        Object r19 = r18.next();
        android.media.session.PlaybackState r20 = ((MediaController) r19).getPlaybackState();
        if (r20 == null) goto L27;
        if (r20.getState() != 1) goto L27;
    L34:
        MediaController r21 = (MediaController) r19;
        if (r4 != null) goto L41;
        if (r17 != null) goto L40;
        if (r21 != null) goto L39;
        r4 = r9.get(0);
        goto L41
    L39:
        r4 = r21;
        goto L41
    L40:
        r4 = r17;
    L41:
        this.curMedia = r4;
        this.isOldMusicControl = false;
        MediaControllerCompat r22 = this.mActiveMediaController;
        if (r22 == null) goto L44;
        String r23 = r22.getPackageName();
    L45:
        MediaController r24 = this.curMedia;
        if (r24 == null) goto L49;
        r1 = r24.getPackageName();
    L49:
        if (Intrinsics.XOO0ii0(r23, r1) == true) goto L52;
        assignActiveController(this.curMedia);
        return;
    L52:
        MediaControllerCompat r25 = this.mActiveMediaController;
        if (r25 == null) goto L59;
        PlaybackStateCompat r26 = r25.getPlaybackState();
        if (r26 == null) goto L59;
        if (r26.getState() != 3) goto L59;
        return;
    L59:
        Iterator<T> r27 = r16.iterator();
    L61:
        if (r27.hasNext() == false) goto L99;
        MediaController r110 = (MediaController) r27.next();
        android.media.session.PlaybackState r28 = r110.getPlaybackState();
        if (r28 == null) goto L61;
        if (r28.getState() != 3) goto L61;
        assignActiveController(r110);
        return;
    L99:
        return;
    L44:
        r23 = null;
        goto L45
    L33:
        r19 = null;
        goto L34
    L24:
        r7 = null;
        goto L25
    L15:
        r3 = null;
        goto L16
    }

    public static /* synthetic */ void autoSwitchActiveController$default(MusicController r0, List r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = false;
    L5:
        r0.autoSwitchActiveController(r1, r2);
    }

    private final ComponentName getNotificationListener(Context r8) {
        if ((r8 instanceof NotificationListenerService) == true) goto L16;
        ServiceInfo[] r0 = r8.getPackageManager().getPackageInfo(r8.getPackageName(), 4).services;
        ServiceInfo r1 = null;
        if (r0 == null) goto L12;
        int r2 = r0.length;
        int r3 = 0;
    L7:
        if (r3 >= r2) goto L12;
        ServiceInfo r4 = r0[r3];
        if (Intrinsics.XOO0ii0(r4.permission, "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE") == true) goto L10;
        r3 = r3 + 1;
        goto L7
    L10:
        r1 = r4;
    L12:
        if (r1 == null) goto L16;
        i1O0OXO1O.OXO1.OXO1("NotificationListener -> " + r1.name);
        return new ComponentName(r8, r1.name);
    L16:
        return new ComponentName(r8, r8.getClass());
    }

    private static final void mOnActiveSessionsChangedListener$lambda$0(MusicController r8, List r9) {
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        StringBuilder r1 = new StringBuilder();
        r1.append("MusicController onActiveSessionsChanged -> ");
        ArrayList r2 = null;
        if (r9 == null) goto L13;
        List r3 = r9;
        ArrayList r4 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r3, 10));
        Iterator r5 = r3.iterator();
    L6:
        if (r5.hasNext() == false) goto L12;
        MediaController r6 = (MediaController) r5.next();
        StringBuilder r7 = new StringBuilder();
        r7.append(r6.getPackageName());
        r7.append(" playbackState=");
        android.media.session.PlaybackState r10 = r6.getPlaybackState();
        if (r10 == null) goto L10;
        Integer r11 = Integer.valueOf(r10.getState());
    L11:
        r7.append(r11);
        r4.add(r7.toString());
        goto L6
    L10:
        r11 = null;
        goto L11
    L12:
        r2 = r4;
    L13:
        r1.append(r2);
        r0.XO0O10(r1.toString());
        r8.autoSwitchActiveController(r9, true);
    }

    private final void releaseActiveController() {
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        StringBuilder r1 = new StringBuilder();
        r1.append("MusicController releaseActiveController -> ");
        MediaControllerCompat r2 = this.mActiveMediaController;
        if (r2 == null) goto L5;
        String r3 = r2.getPackageName();
    L6:
        r1.append(r3);
        r0.XO0O10(r1.toString());
        if (this.mActiveMediaController == null) goto L13;
        String r4 = String.valueOf(PlaybackState.PAUSED.getMState());
        StringCompanionObject r5 = StringCompanionObject.OXO1;
        String r6 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(0.0f)}, 1));
        Intrinsics.O10IXXX0X(r6, "format(...)");
        BleConnector.INSTANCE.updateMusic(new BleMusicControl(MusicEntity.PLAYER, MusicAttr.PLAYER_PLAYBACK_INFO, CollectionsKt__CollectionsKt.iXiX011(new String[]{r4, r6, ",0"})));
        MediaControllerCompat r7 = this.mActiveMediaController;
        if (r7 == null) goto L11;
        r7.unregisterCallback(this.mCallback);
    L11:
        this.mActiveMediaController = null;
        return;
    L13:
        return;
    L5:
        r3 = null;
        goto L6
    }

    private final void sendMediaKeyEvent(int r5) {
        MediaControllerCompat r0 = this.mActiveMediaController;
        if (r0 != null) goto L5;
    L49:
        AudioManager r1 = getMAudioManager();
        if (r1 == null) goto L52;
        r1.dispatchMediaKeyEvent(new KeyEvent(0, r5));
    L52:
        AudioManager r2 = getMAudioManager();
        if (r2 == null) goto L65;
        r2.dispatchMediaKeyEvent(new KeyEvent(1, r5));
        return;
    L65:
        return;
    L5:
        if (this.curMedia == null) goto L49;
        if (r0 == null) goto L56;
        if (r0 == null) goto L47;
        if (r0 == null) goto L11;
        MediaControllerCompat.TransportControls r3 = r0.getTransportControls();
    L12:
        if (r3 == null) goto L47;
        if (r5 != 87) goto L16;
        MediaControllerCompat r6 = this.mActiveMediaController;
        if (r6 == null) goto L63;
        MediaControllerCompat.TransportControls r7 = r6.getTransportControls();
        if (r7 == null) goto L64;
        r7.skipToNext();
        return;
    L64:
        return;
    L63:
        return;
    L16:
        if (r5 != 88) goto L18;
        MediaControllerCompat r8 = this.mActiveMediaController;
        if (r8 == null) goto L61;
        MediaControllerCompat.TransportControls r9 = r8.getTransportControls();
        if (r9 == null) goto L62;
        r9.skipToPrevious();
        return;
    L62:
        return;
    L61:
        return;
    L18:
        if (r5 != 126) goto L20;
        MediaControllerCompat r10 = this.mActiveMediaController;
        if (r10 == null) goto L59;
        MediaControllerCompat.TransportControls r11 = r10.getTransportControls();
        if (r11 == null) goto L60;
        r11.play();
        return;
    L60:
        return;
    L59:
        return;
    L20:
        if (r5 == 127) goto L23;
        r0.dispatchMediaButtonEvent(new KeyEvent(0, r5));
        r0.dispatchMediaButtonEvent(new KeyEvent(1, r5));
        return;
    L23:
        MediaControllerCompat r12 = this.mActiveMediaController;
        if (r12 == null) goto L57;
        MediaControllerCompat.TransportControls r13 = r12.getTransportControls();
        if (r13 == null) goto L58;
        r13.pause();
        return;
    L58:
        return;
    L57:
        return;
    L11:
        r3 = null;
    L47:
        r0.dispatchMediaButtonEvent(new KeyEvent(0, r5));
        r0.dispatchMediaButtonEvent(new KeyEvent(1, r5));
        return;
    }

    private final void updateMusic(String r7, String r8, String r9, String r10) {
        if (StringsKt__StringsKt.iX1X1(this.lastArtist).toString().length() != 0) goto L6;
        this.lastArtist = r7;
    L6:
        if (StringsKt__StringsKt.iX1X1(this.lastAlbum).toString().length() != 0) goto L8;
        this.lastAlbum = r8;
    L8:
        long r0 = System.currentTimeMillis();
        if (Intrinsics.XOO0ii0(StringsKt__StringsKt.iX1X1(this.lastArtist).toString(), StringsKt__StringsKt.iX1X1(r7).toString()) == true) goto L11;
    L16:
        this.lastArtist = r7;
        this.lastAlbum = r8;
        this.tempTime = r0;
        BleConnector r1 = BleConnector.INSTANCE;
        MusicEntity r2 = MusicEntity.TRACK;
        r1.updateMusic(new BleMusicControl(r2, MusicAttr.TRACK_ARTIST, r7));
        r1.updateMusic(new BleMusicControl(r2, MusicAttr.TRACK_ALBUM, r8));
        r1.updateMusic(new BleMusicControl(r2, MusicAttr.TRACK_TITLE, r9));
        r1.updateMusic(new BleMusicControl(r2, MusicAttr.TRACK_DURATION, r10));
        return;
    L11:
        if (Intrinsics.XOO0ii0(StringsKt__StringsKt.iX1X1(this.lastAlbum).toString(), StringsKt__StringsKt.iX1X1(r8).toString()) == false) goto L16;
        if ((r0 - this.tempTime) <= 30000) goto L18;
        this.tempTime = r0;
        BleConnector r3 = BleConnector.INSTANCE;
        MusicEntity r4 = MusicEntity.TRACK;
        r3.updateMusic(new BleMusicControl(r4, MusicAttr.TRACK_ARTIST, r7));
        r3.updateMusic(new BleMusicControl(r4, MusicAttr.TRACK_ALBUM, r8));
        r3.updateMusic(new BleMusicControl(r4, MusicAttr.TRACK_TITLE, r9));
        r3.updateMusic(new BleMusicControl(r4, MusicAttr.TRACK_DURATION, r10));
        return;
    }

    @Override // com.szabh.smable3.music.MusicControllerCompat
    public void exit() {
        i1O0OXO1O.OXO1.XO0O10("MusicController exit");
        BleConnector.INSTANCE.removeHandleCallback(this.mBleHandleCallback);
        releaseActiveController();
        super.exit();
    }

    @tb1
    public final MediaController getCurMedia() {
        return this.curMedia;
    }

    public final boolean isOldMusicControl() {
        return this.isOldMusicControl;
    }

    @aa1
    public final String keepTwoDecimal(float r4) {
        if (Math.abs(r4) > Float.MAX_VALUE) goto L6;
        String r5 = new DecimalFormat("#.##", DecimalFormatSymbols.getInstance(Locale.ENGLISH)).format(new BigDecimal(String.valueOf(r4)));
        Intrinsics.XXI(r5);
        return r5;
    L6:
        return "0.00";
    }

    @Override // com.szabh.smable3.music.MusicControllerCompat
    public void launch(@aa1 Context r10) {
        Intrinsics.X0O(r10, "context");
        super.launch(r10);
        this.mNotificationListener = getNotificationListener(r10);     // Catch: Exception -> L7
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;     // Catch: Exception -> L7
        StringBuilder r1 = new StringBuilder();     // Catch: Exception -> L7
        r1.append("MusicController launch notificationListener -> ");     // Catch: Exception -> L7
        ComponentName r2 = this.mNotificationListener;     // Catch: Exception -> L7
        ComponentName r4 = null;
        if (r2 != null) goto L9;
        Intrinsics.XXO("mNotificationListener");     // Catch: Exception -> L7
        r2 = null;
    L9:
        r1.append(r2);     // Catch: Exception -> L7
        r0.XO0O10(r1.toString());     // Catch: Exception -> L7
        Object r11 = r10.getSystemService("media_session");     // Catch: Exception -> L7
        Intrinsics.X1ii(r11, "null cannot be cast to non-null type android.media.session.MediaSessionManager");     // Catch: Exception -> L7
        MediaSessionManager r12 = (MediaSessionManager) r11;     // Catch: Exception -> L7
        this.mMediaSessionManager = r12;     // Catch: Exception -> L7
        if (r12 == null) goto L15;
        ComponentName r3 = this.mNotificationListener;     // Catch: Exception -> L7
        if (r3 != null) goto L14;
        Intrinsics.XXO("mNotificationListener");     // Catch: Exception -> L7
        r3 = null;
    L14:
        List<MediaController> r13 = r12.getActiveSessions(r3);     // Catch: Exception -> L7
    L16:
        StringBuilder r5 = new StringBuilder();     // Catch: Exception -> L7
        r5.append("MusicController launch activeMediaControllers -> ");     // Catch: Exception -> L7
        if (r13 == null) goto L26;
        List<MediaController> r6 = r13;     // Catch: Exception -> L7
        ArrayList r7 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r6, 10));     // Catch: Exception -> L7
        Iterator<T> r8 = r6.iterator();     // Catch: Exception -> L7
    L20:
        if (r8.hasNext() == false) goto L27;
        MediaController r9 = (MediaController) r8.next();     // Catch: Exception -> L7
        StringBuilder r14 = new StringBuilder();     // Catch: Exception -> L7
        r14.append(r9.getPackageName());     // Catch: Exception -> L7
        r14.append(" playbackState=");     // Catch: Exception -> L7
        android.media.session.PlaybackState r15 = r9.getPlaybackState();     // Catch: Exception -> L7
        if (r15 == null) goto L24;
        Integer r16 = Integer.valueOf(r15.getState());     // Catch: Exception -> L7
    L25:
        r14.append(r16);     // Catch: Exception -> L7
        r7.add(r14.toString());     // Catch: Exception -> L7
        goto L20
    L24:
        r16 = null;
    L27:
        r5.append(r7);     // Catch: Exception -> L7
        r0.XO0O10(r5.toString());     // Catch: Exception -> L7
        autoSwitchActiveController$default(this, r13, false, 2, null);     // Catch: Exception -> L7
        MediaSessionManager r17 = this.mMediaSessionManager;     // Catch: Exception -> L7
        if (r17 == null) goto L36;
        MediaSessionManager.OnActiveSessionsChangedListener r18 = this.mOnActiveSessionsChangedListener;     // Catch: Exception -> L7
        ComponentName r19 = this.mNotificationListener;     // Catch: Exception -> L7
        if (r19 != null) goto L32;
        Intrinsics.XXO("mNotificationListener");     // Catch: Exception -> L7
    L33:
        r17.addOnActiveSessionsChangedListener(r18, r4);     // Catch: Exception -> L7
        goto L36
    L32:
        r4 = r19;
    L36:
        BleConnector.INSTANCE.addHandleCallback(this.mBleHandleCallback);
        return;
    L26:
        r7 = null;
        goto L27
    L15:
        r13 = null;
    L7:
        e = move-exception;
        e.printStackTrace();
        i1O0OXO1O.OXO1.XIi00iiXO("MusicController launch notificationListener error -> " + e.getMessage());
        goto L36
    }

    public final void setCurMedia(@tb1 MediaController r1) {
        this.curMedia = r1;
    }

    public final void setOldMusicControl(boolean r1) {
        this.isOldMusicControl = r1;
    }

    public final void updateMetadata(@tb1 MediaMetadataCompat r8) {
        if (r8 == null) goto L19;
        String r0 = r8.getString("android.media.metadata.ARTIST");
        String r1 = " ";
        if (r0 != null) goto L7;
        r0 = " ";
    L7:
        String r2 = r8.getString("android.media.metadata.ALBUM");
        if (r2 != null) goto L10;
        r2 = " ";
    L10:
        String r3 = r8.getString("android.media.metadata.TITLE");
        if (r3 == null) goto L14;
        r1 = r3;
    L14:
        String r9 = String.valueOf(r8.getLong("android.media.metadata.DURATION") / ((long) 1000));
        i1O0OXO1O.OXO1.XO0O10("MusicController updateMetadata -> METADATA_KEY_ARTIST=" + r0 + " , METADATA_KEY_ALBUM=" + r2 + ", METADATA_KEY_TITLE=" + r1 + ", METADATA_KEY_DURATION=" + r9 + " ,  lastArtist=" + this.lastArtist + ", lastAlbum=" + this.lastAlbum);
        updateMusic(r0, r2, r1, r9);
        if (this.mLastVolume != (-1)) goto L18;
        updateVolume();
        return;
    L18:
        return;
    }

    public final void updatePlaybackState(@tb1 PlaybackStateCompat r11) {
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        r0.XO0O10("MusicController updatePlaybackState -> state=" + Companion.access$getState(Companion, r11) + ' ' + r11);
        if (r11 == null) goto L57;
        int r1 = r11.getState();
        if (r1 != 1) goto L8;
    L19:
        byte r2 = PlaybackState.PAUSED.getMState();
    L21:
        if (r2 == PlaybackState.UNKNOWN.getMState()) goto L29;
        String r3 = String.valueOf(r2);
        StringCompanionObject r4 = StringCompanionObject.OXO1;
        String r5 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(r11.getPlaybackSpeed())}, 1));
        Intrinsics.O10IXXX0X(r5, "format(...)");
        StringBuilder r6 = new StringBuilder();
        r6.append(',');
        r6.append(r11.getPosition() / ((long) 1000));
        List r12 = CollectionsKt__CollectionsKt.iXiX011(new String[]{r3, r5, r6.toString()});
        r0.XO0O10("MusicController updatePlaybackState -> contents=" + r12);
        if (Intrinsics.XOO0ii0(this.lastStateContents, r12) == true) goto L26;
        this.lastStateContents.clear();
        this.lastStateContents.addAll(r12);
        BleConnector.INSTANCE.updateMusic(new BleMusicControl(MusicEntity.PLAYER, MusicAttr.PLAYER_PLAYBACK_INFO, r12));
    L26:
        if (this.mLastVolume != (-1)) goto L29;
        updateVolume();
    L29:
        if (r2 == PlaybackState.PAUSED.getMState()) goto L31;
        return;
    L31:
        if (getMContext() == null) goto L56;
        MediaSessionManager r13 = this.mMediaSessionManager;
        ArrayList r7 = null;
        if (r13 == null) goto L38;
        ComponentName r8 = this.mNotificationListener;
        if (r8 != null) goto L37;
        Intrinsics.XXO("mNotificationListener");
        r8 = null;
    L37:
        List<MediaController> r14 = r13.getActiveSessions(r8);
    L39:
        StringBuilder r9 = new StringBuilder();
        r9.append("MusicController updatePlaybackState activeMediaControllers -> ");
        if (r14 == null) goto L50;
        List<MediaController> r10 = r14;
        ArrayList r15 = new ArrayList(CollectionsKt__IterablesKt.X00XIX1(r10, 10));
        Iterator<T> r16 = r10.iterator();
    L43:
        if (r16.hasNext() == false) goto L49;
        MediaController r17 = (MediaController) r16.next();
        StringBuilder r18 = new StringBuilder();
        r18.append(r17.getPackageName());
        r18.append(" playbackState=");
        android.media.session.PlaybackState r19 = r17.getPlaybackState();
        if (r19 == null) goto L47;
        Integer r20 = Integer.valueOf(r19.getState());
    L48:
        r18.append(r20);
        r15.add(r18.toString());
        goto L43
    L47:
        r20 = null;
        goto L48
    L49:
        r7 = r15;
    L50:
        r9.append(r7);
        r0.XO0O10(r9.toString());
        autoSwitchActiveController(r14, true);
        return;
    L38:
        r14 = null;
        goto L39
    L56:
        return;
    L8:
        if (r1 == 2) goto L19;
        if (r1 != 3) goto L12;
        r2 = PlaybackState.PLAYING.getMState();
        goto L21
    L12:
        if (r1 != 4) goto L14;
        r2 = PlaybackState.FAST_FORWARDING.getMState();
        goto L21
    L14:
        if (r1 == 5) goto L16;
        r2 = PlaybackState.UNKNOWN.getMState();
        goto L21
    L16:
        r2 = PlaybackState.REWINDING.getMState();
        goto L21
    }

    @Override // com.szabh.smable3.music.MusicControllerCompat
    public void updateVolume() {
        int r1 = getStreamVolume(3);
        int r0 = getStreamMaxVolume(3);
        if ((System.currentTimeMillis() - this.mLastVolumeTime) > 150) goto L10;
        if (r1 == 0) goto L8;
        if (r1 == r0) goto L8;
        return;
    L8:
        if (r1 != this.mLastVolume) goto L10;
        return;
    L10:
        this.mLastVolumeTime = System.currentTimeMillis();
        String r2 = keepTwoDecimal(r1 / r0);
        if (BleConnector.INSTANCE.updateMusic(new BleMusicControl(MusicEntity.PLAYER, MusicAttr.PLAYER_VOLUME, r2)) == false) goto L14;
        i1O0OXO1O.OXO1.OXO1("updateVolume -> mLastVolume=" + this.mLastVolume + " , curVolume=" + r1 + " , value=" + r2);
        this.mLastVolume = r1;
        return;
    }
}
