package com.sma.smartv3.db.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.FileUtils;
import java.io.Serializable;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Entity(indices = {@Index(unique = true, value = {"mTime"})})
public final class RecordDeviceFile implements Serializable {
    public static final int CONVERSION_FAILED = 3;
    public static final int CONVERSION_NONE = 0;
    public static final int CONVERSION_SUCCESS = 1;

    @aa1
    public static final Companion Companion = null;
    private static final int PROCESS_STATUS_COMPLETED = 0;
    private static final int PROCESS_STATUS_DEFAULT = 0;
    private static final int PROCESS_STATUS_FAILED = 0;
    private static final int PROCESS_STATUS_NOT_PROCESSED = 0;
    private static final int PROCESS_STATUS_PENDING = 0;
    private static final int PROCESS_STATUS_PROCESSING = 0;
    private static final int PROCESS_TYPE_DEFAULT = 0;
    private static final int PROCESS_TYPE_TRANSCODE = 0;
    private static final int PROCESS_TYPE_VS_IMAGE = 0;
    private static final int PROCESS_TYPE_VS_JZ = 0;
    private static final int RESERVED_TYPE_AI_SUMMARY_JSON = 0;
    private static final int RESERVED_TYPE_AI_SUMMARY_V3_JSON = 0;
    private static final int RESERVED_TYPE_EDIT = 0;
    private static final int RESERVED_TYPE_RECORD_USING_APP = 0;
    private static final int RESERVED_TYPE_TRANSCRIPTION_JSON = 0;
    private static final int RESERVED_TYPE_TRY_IT_NOW = 0;
    private static final int RESERVED_TYPE_USE_RECORDING_CARD = 0;
    private static final int TYPE_AUDIO = 0;
    private static final int TYPE_AUDIO_FOUR = 0;
    private static final int TYPE_AUDIO_ZORE = 0;
    private static final int TYPE_GUIDE_DATA = 0;
    private static final int TYPE_IMAGE = 0;
    private static final int TYPE_UNKNOWN = 0;
    private static final int TYPE_VIDEO = 0;

    @Ignore
    private boolean isSelected;

    @aa1
    @ColumnInfo
    private String mContent;

    @ColumnInfo
    private long mDuration;

    @aa1
    @ColumnInfo
    private String mFileName;

    @ColumnInfo
    private int mFileType;

    @ColumnInfo
    private int mHeight;

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo
    private long mId;

    @ColumnInfo
    private int mIsConversion;

    @ColumnInfo
    private int mIsDelete;

    @ColumnInfo
    private int mIsFavority;

    @ColumnInfo
    private int mIsRead;

    @ColumnInfo
    private int mIsSummaryReport;

    @ColumnInfo
    private int mIsSync;

    @aa1
    @ColumnInfo
    private String mLocalTime;

    @ColumnInfo
    private int mModel;

    @aa1
    @ColumnInfo
    private String mName;

    @aa1
    @ColumnInfo
    private String mPath;

    @Ignore
    private int mPosition;

    @aa1
    @ColumnInfo
    private String mProcessPath;

    @ColumnInfo
    private int mProcessStatus;

    @ColumnInfo
    private int mProcessType;

    @aa1
    @Ignore
    private String mRemotePath;

    @aa1
    @ColumnInfo
    private String mReservedText;

    @ColumnInfo
    private int mReservedTextType;

    @ColumnInfo
    private long mSize;

    @aa1
    @ColumnInfo
    private String mSummaryReportText;

    @aa1
    @ColumnInfo
    private String mTaskId;

    @aa1
    @ColumnInfo
    private String mThumbnail;

    @ColumnInfo
    private long mTime;

    @aa1
    @Ignore
    private String mUrl;

    @ColumnInfo
    private int mWidth;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker r1) {
            this();
        }

        public final int getFileType(@aa1 String r2) {
            Intrinsics.X0O(r2, "name");
            String r3 = FileUtils.getFileExtension(r2);
            Intrinsics.O10IXXX0X(r3, "getFileExtension(...)");
            String r4 = r3.toLowerCase(Locale.ROOT);
            Intrinsics.O10IXXX0X(r4, "toLowerCase(...)");
            switch(r4.hashCode()) {
                case 73665: goto L49;
                case 76532: goto L44;
                case 96323: goto L39;
                case 96980: goto L36;
                case 105441: goto L33;
                case 108272: goto L30;
                case 108273: goto L27;
                case 108308: goto L24;
                case 110810: goto L21;
                case 117484: goto L18;
                case 2283624: goto L15;
                case 3268712: goto L12;
                case 3418175: goto L9;
                case 3645340: goto L6;
                default: goto L51;
            };
        L6:
            if (r4.equals("webp") == false) goto L51;
        L53:
            return getTYPE_IMAGE();
        L9:
            if (r4.equals("opus") == false) goto L51;
        L42:
            return getTYPE_AUDIO();
        L12:
            if (r4.equals("jpeg") == true) goto L53;
        L15:
            if (r4.equals("JPEG") == true) goto L53;
        L18:
            if (r4.equals("wav") == true) goto L42;
        L21:
            if (r4.equals("pcm") == true) goto L42;
        L24:
            if (r4.equals("mov") == false) goto L51;
        L47:
            return getTYPE_VIDEO();
        L27:
            if (r4.equals("mp4") == true) goto L47;
        L30:
            if (r4.equals("mp3") == true) goto L42;
        L33:
            if (r4.equals("jpg") == true) goto L53;
        L36:
            if (r4.equals("avi") == true) goto L47;
        L39:
            if (r4.equals("aac") == true) goto L42;
        L44:
            if (r4.equals("MOV") == true) goto L47;
        L49:
            if (r4.equals("JPG") == true) goto L53;
        L51:
            return getTYPE_UNKNOWN();
        }

        public final int getPROCESS_STATUS_COMPLETED() {
            return RecordDeviceFile.access$getPROCESS_STATUS_COMPLETED$cp();
        }

        public final int getPROCESS_STATUS_DEFAULT() {
            return RecordDeviceFile.access$getPROCESS_STATUS_DEFAULT$cp();
        }

        public final int getPROCESS_STATUS_FAILED() {
            return RecordDeviceFile.access$getPROCESS_STATUS_FAILED$cp();
        }

        public final int getPROCESS_STATUS_NOT_PROCESSED() {
            return RecordDeviceFile.access$getPROCESS_STATUS_NOT_PROCESSED$cp();
        }

        public final int getPROCESS_STATUS_PENDING() {
            return RecordDeviceFile.access$getPROCESS_STATUS_PENDING$cp();
        }

        public final int getPROCESS_STATUS_PROCESSING() {
            return RecordDeviceFile.access$getPROCESS_STATUS_PROCESSING$cp();
        }

        public final int getPROCESS_TYPE_DEFAULT() {
            return RecordDeviceFile.access$getPROCESS_TYPE_DEFAULT$cp();
        }

        public final int getPROCESS_TYPE_TRANSCODE() {
            return RecordDeviceFile.access$getPROCESS_TYPE_TRANSCODE$cp();
        }

        public final int getPROCESS_TYPE_VS_IMAGE() {
            return RecordDeviceFile.access$getPROCESS_TYPE_VS_IMAGE$cp();
        }

        public final int getPROCESS_TYPE_VS_JZ() {
            return RecordDeviceFile.access$getPROCESS_TYPE_VS_JZ$cp();
        }

        public final int getRESERVED_TYPE_AI_SUMMARY_JSON() {
            return RecordDeviceFile.access$getRESERVED_TYPE_AI_SUMMARY_JSON$cp();
        }

        public final int getRESERVED_TYPE_AI_SUMMARY_V3_JSON() {
            return RecordDeviceFile.access$getRESERVED_TYPE_AI_SUMMARY_V3_JSON$cp();
        }

        public final int getRESERVED_TYPE_EDIT() {
            return RecordDeviceFile.access$getRESERVED_TYPE_EDIT$cp();
        }

        public final int getRESERVED_TYPE_RECORD_USING_APP() {
            return RecordDeviceFile.access$getRESERVED_TYPE_RECORD_USING_APP$cp();
        }

        public final int getRESERVED_TYPE_TRANSCRIPTION_JSON() {
            return RecordDeviceFile.access$getRESERVED_TYPE_TRANSCRIPTION_JSON$cp();
        }

        public final int getRESERVED_TYPE_TRY_IT_NOW() {
            return RecordDeviceFile.access$getRESERVED_TYPE_TRY_IT_NOW$cp();
        }

        public final int getRESERVED_TYPE_USE_RECORDING_CARD() {
            return RecordDeviceFile.access$getRESERVED_TYPE_USE_RECORDING_CARD$cp();
        }

        public final int getTYPE_AUDIO() {
            return RecordDeviceFile.access$getTYPE_AUDIO$cp();
        }

        public final int getTYPE_AUDIO_FOUR() {
            return RecordDeviceFile.access$getTYPE_AUDIO_FOUR$cp();
        }

        public final int getTYPE_AUDIO_ZORE() {
            return RecordDeviceFile.access$getTYPE_AUDIO_ZORE$cp();
        }

        public final int getTYPE_GUIDE_DATA() {
            return RecordDeviceFile.access$getTYPE_GUIDE_DATA$cp();
        }

        public final int getTYPE_IMAGE() {
            return RecordDeviceFile.access$getTYPE_IMAGE$cp();
        }

        public final int getTYPE_UNKNOWN() {
            return RecordDeviceFile.access$getTYPE_UNKNOWN$cp();
        }

        public final int getTYPE_VIDEO() {
            return RecordDeviceFile.access$getTYPE_VIDEO$cp();
        }

        private Companion() {
        }
    }

    static {
        Companion = new Companion(null);
        RESERVED_TYPE_TRANSCRIPTION_JSON = 1;
        RESERVED_TYPE_AI_SUMMARY_JSON = 2;
        RESERVED_TYPE_AI_SUMMARY_V3_JSON = 3;
        RESERVED_TYPE_TRY_IT_NOW = 4;
        RESERVED_TYPE_USE_RECORDING_CARD = 5;
        RESERVED_TYPE_RECORD_USING_APP = 6;
        RESERVED_TYPE_EDIT = 7;
        TYPE_IMAGE = 1;
        TYPE_VIDEO = 2;
        TYPE_AUDIO = 3;
        TYPE_AUDIO_FOUR = 4;
        TYPE_GUIDE_DATA = 5;
        PROCESS_TYPE_VS_IMAGE = 1;
        PROCESS_TYPE_VS_JZ = 2;
        PROCESS_TYPE_TRANSCODE = 3;
        PROCESS_STATUS_NOT_PROCESSED = -1;
        PROCESS_STATUS_PENDING = 1;
        PROCESS_STATUS_PROCESSING = 2;
        PROCESS_STATUS_COMPLETED = 3;
        PROCESS_STATUS_FAILED = 4;
    }

    public RecordDeviceFile() {
        long r1 = 0;
        long r3 = 0;
        String r5 = null;
        String r6 = null;
        String r7 = null;
        long r8 = 0;
        int r10 = 0;
        int r11 = 0;
        long r12 = 0;
        String r14 = null;
        int r15 = 0;
        int r16 = 0;
        String r17 = null;
        int r18 = 0;
        int r19 = 0;
        int r20 = 0;
        int r21 = 0;
        String r22 = null;
        boolean r23 = false;
        String r24 = null;
        String r25 = null;
        int r26 = 0;
        int r27 = 0;
        int r28 = 0;
        int r29 = 0;
        String r30 = null;
        int r31 = 0;
        String r32 = null;
        String r33 = null;
        String r34 = null;
        int r35 = 0;
        this(r1, r3, r5, r6, r7, r8, r10, r11, r12, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, Integer.MAX_VALUE, null);
    }

    public static final /* synthetic */ int access$getPROCESS_STATUS_COMPLETED$cp() {
        return PROCESS_STATUS_COMPLETED;
    }

    public static final /* synthetic */ int access$getPROCESS_STATUS_DEFAULT$cp() {
        return PROCESS_STATUS_DEFAULT;
    }

    public static final /* synthetic */ int access$getPROCESS_STATUS_FAILED$cp() {
        return PROCESS_STATUS_FAILED;
    }

    public static final /* synthetic */ int access$getPROCESS_STATUS_NOT_PROCESSED$cp() {
        return PROCESS_STATUS_NOT_PROCESSED;
    }

    public static final /* synthetic */ int access$getPROCESS_STATUS_PENDING$cp() {
        return PROCESS_STATUS_PENDING;
    }

    public static final /* synthetic */ int access$getPROCESS_STATUS_PROCESSING$cp() {
        return PROCESS_STATUS_PROCESSING;
    }

    public static final /* synthetic */ int access$getPROCESS_TYPE_DEFAULT$cp() {
        return PROCESS_TYPE_DEFAULT;
    }

    public static final /* synthetic */ int access$getPROCESS_TYPE_TRANSCODE$cp() {
        return PROCESS_TYPE_TRANSCODE;
    }

    public static final /* synthetic */ int access$getPROCESS_TYPE_VS_IMAGE$cp() {
        return PROCESS_TYPE_VS_IMAGE;
    }

    public static final /* synthetic */ int access$getPROCESS_TYPE_VS_JZ$cp() {
        return PROCESS_TYPE_VS_JZ;
    }

    public static final /* synthetic */ int access$getRESERVED_TYPE_AI_SUMMARY_JSON$cp() {
        return RESERVED_TYPE_AI_SUMMARY_JSON;
    }

    public static final /* synthetic */ int access$getRESERVED_TYPE_AI_SUMMARY_V3_JSON$cp() {
        return RESERVED_TYPE_AI_SUMMARY_V3_JSON;
    }

    public static final /* synthetic */ int access$getRESERVED_TYPE_EDIT$cp() {
        return RESERVED_TYPE_EDIT;
    }

    public static final /* synthetic */ int access$getRESERVED_TYPE_RECORD_USING_APP$cp() {
        return RESERVED_TYPE_RECORD_USING_APP;
    }

    public static final /* synthetic */ int access$getRESERVED_TYPE_TRANSCRIPTION_JSON$cp() {
        return RESERVED_TYPE_TRANSCRIPTION_JSON;
    }

    public static final /* synthetic */ int access$getRESERVED_TYPE_TRY_IT_NOW$cp() {
        return RESERVED_TYPE_TRY_IT_NOW;
    }

    public static final /* synthetic */ int access$getRESERVED_TYPE_USE_RECORDING_CARD$cp() {
        return RESERVED_TYPE_USE_RECORDING_CARD;
    }

    public static final /* synthetic */ int access$getTYPE_AUDIO$cp() {
        return TYPE_AUDIO;
    }

    public static final /* synthetic */ int access$getTYPE_AUDIO_FOUR$cp() {
        return TYPE_AUDIO_FOUR;
    }

    public static final /* synthetic */ int access$getTYPE_AUDIO_ZORE$cp() {
        return TYPE_AUDIO_ZORE;
    }

    public static final /* synthetic */ int access$getTYPE_GUIDE_DATA$cp() {
        return TYPE_GUIDE_DATA;
    }

    public static final /* synthetic */ int access$getTYPE_IMAGE$cp() {
        return TYPE_IMAGE;
    }

    public static final /* synthetic */ int access$getTYPE_UNKNOWN$cp() {
        return TYPE_UNKNOWN;
    }

    public static final /* synthetic */ int access$getTYPE_VIDEO$cp() {
        return TYPE_VIDEO;
    }

    public static /* synthetic */ RecordDeviceFile copy$default(RecordDeviceFile r19, long r20, long r22, String r24, String r25, String r26, long r27, int r29, int r30, long r31, String r33, int r34, int r35, String r36, int r37, int r38, int r39, int r40, String r41, boolean r42, String r43, String r44, int r45, int r46, int r47, int r48, String r49, int r50, String r51, String r52, String r53, int r54, int r55, Object r56) {
        if ((r55 & 1) == 0) goto L5;
        long r2 = r19.mId;
    L7:
        if ((r55 & 2) == 0) goto L9;
        long r4 = r19.mTime;
    L11:
        if ((r55 & 4) == 0) goto L13;
        String r6 = r19.mLocalTime;
    L15:
        if ((r55 & 8) == 0) goto L17;
        String r7 = r19.mName;
    L19:
        if ((r55 & 16) == 0) goto L21;
        String r8 = r19.mPath;
    L23:
        if ((r55 & 32) == 0) goto L25;
        long r9 = r19.mSize;
    L27:
        if ((r55 & 64) == 0) goto L29;
        int r11 = r19.mWidth;
    L31:
        if ((r55 & 128) == 0) goto L33;
        int r12 = r19.mHeight;
    L35:
        if ((r55 & 256) == 0) goto L37;
        long r13 = r19.mDuration;
    L39:
        if ((r55 & 512) == 0) goto L41;
        String r15 = r19.mThumbnail;
    L42:
        long r16 = r2;
        if ((r55 & 1024) == 0) goto L45;
        int r3 = r19.mFileType;
    L47:
        if ((r55 & 2048) == 0) goto L49;
        int r5 = r19.mIsFavority;
    L50:
        int r21 = r3;
        if ((r55 & 4096) == 0) goto L53;
        String r10 = r19.mContent;
    L54:
        String r23 = r10;
        if ((r55 & 8192) == 0) goto L57;
        int r14 = r19.mIsSync;
    L58:
        int r28 = r14;
        if ((r55 & 16384) == 0) goto L61;
        int r17 = r19.mIsDelete;
    L63:
        if ((r55 & 32768) == 0) goto L65;
        int r1 = r19.mProcessType;
    L66:
        int r210 = r1;
        if ((r55 & 65536) == 0) goto L69;
        int r18 = r19.mProcessStatus;
    L70:
        int r211 = r18;
        if ((r55 & 131072) == 0) goto L73;
        String r32 = r19.mProcessPath;
    L74:
        String r212 = r32;
        if ((r55 & 262144) == 0) goto L77;
        boolean r57 = r19.isSelected;
    L78:
        boolean r213 = r57;
        if ((r55 & 524288) == 0) goto L81;
        String r58 = r19.mUrl;
    L82:
        String r214 = r58;
        if ((r55 & 1048576) == 0) goto L85;
        String r59 = r19.mRemotePath;
    L86:
        String r215 = r59;
        if ((r55 & 2097152) == 0) goto L89;
        int r60 = r19.mPosition;
    L90:
        int r216 = r60;
        if ((r55 & 4194304) == 0) goto L93;
        int r61 = r19.mIsRead;
    L94:
        int r310 = r61;
        if ((r55 & 8388608) == 0) goto L97;
        int r62 = r19.mIsConversion;
    L98:
        int r311 = r62;
        if ((r55 & 16777216) == 0) goto L101;
        int r63 = r19.mReservedTextType;
    L102:
        int r312 = r63;
        if ((r55 & 33554432) == 0) goto L105;
        String r64 = r19.mReservedText;
    L106:
        String r313 = r64;
        if ((r55 & 67108864) == 0) goto L109;
        int r65 = r19.mIsSummaryReport;
    L110:
        int r314 = r65;
        if ((r55 & 134217728) == 0) goto L113;
        String r66 = r19.mSummaryReportText;
    L114:
        String r315 = r66;
        if ((r55 & 268435456) == 0) goto L117;
        String r67 = r19.mFileName;
    L118:
        String r316 = r67;
        if ((r55 & 536870912) == 0) goto L121;
        String r68 = r19.mTaskId;
    L123:
        if ((r55 & 1073741824) == 0) goto L125;
        String r317 = r68;
        String r510 = r317;
        int r511 = r19.mModel;
    L127:
        return r19.copy(r16, r4, r6, r7, r8, r9, r11, r12, r13, r15, r21, r5, r23, r28, r17, r210, r211, r212, r213, r214, r215, r216, r310, r311, r312, r313, r314, r315, r316, r510, r511);
    L125:
        r511 = r54;
        r510 = r68;
        goto L127
    L121:
        r68 = r53;
        goto L123
    L117:
        r67 = r52;
        goto L118
    L113:
        r66 = r51;
        goto L114
    L109:
        r65 = r50;
        goto L110
    L105:
        r64 = r49;
        goto L106
    L101:
        r63 = r48;
        goto L102
    L97:
        r62 = r47;
        goto L98
    L93:
        r61 = r46;
        goto L94
    L89:
        r60 = r45;
        goto L90
    L85:
        r59 = r44;
        goto L86
    L81:
        r58 = r43;
        goto L82
    L77:
        r57 = r42;
        goto L78
    L73:
        r32 = r41;
        goto L74
    L69:
        r18 = r40;
        goto L70
    L65:
        r1 = r39;
        goto L66
    L61:
        r17 = r38;
        goto L63
    L57:
        r14 = r37;
        goto L58
    L53:
        r10 = r36;
        goto L54
    L49:
        r5 = r35;
        goto L50
    L45:
        r3 = r34;
        goto L47
    L41:
        r15 = r33;
        goto L42
    L37:
        r13 = r31;
        goto L39
    L33:
        r12 = r30;
        goto L35
    L29:
        r11 = r29;
        goto L31
    L25:
        r9 = r27;
        goto L27
    L21:
        r8 = r26;
        goto L23
    L17:
        r7 = r25;
        goto L19
    L13:
        r6 = r24;
        goto L15
    L9:
        r4 = r22;
        goto L11
    L5:
        r2 = r20;
        goto L7
    }

    public final long component1() {
        return this.mId;
    }

    @aa1
    public final String component10() {
        return this.mThumbnail;
    }

    public final int component11() {
        return this.mFileType;
    }

    public final int component12() {
        return this.mIsFavority;
    }

    @aa1
    public final String component13() {
        return this.mContent;
    }

    public final int component14() {
        return this.mIsSync;
    }

    public final int component15() {
        return this.mIsDelete;
    }

    public final int component16() {
        return this.mProcessType;
    }

    public final int component17() {
        return this.mProcessStatus;
    }

    @aa1
    public final String component18() {
        return this.mProcessPath;
    }

    public final boolean component19() {
        return this.isSelected;
    }

    public final long component2() {
        return this.mTime;
    }

    @aa1
    public final String component20() {
        return this.mUrl;
    }

    @aa1
    public final String component21() {
        return this.mRemotePath;
    }

    public final int component22() {
        return this.mPosition;
    }

    public final int component23() {
        return this.mIsRead;
    }

    public final int component24() {
        return this.mIsConversion;
    }

    public final int component25() {
        return this.mReservedTextType;
    }

    @aa1
    public final String component26() {
        return this.mReservedText;
    }

    public final int component27() {
        return this.mIsSummaryReport;
    }

    @aa1
    public final String component28() {
        return this.mSummaryReportText;
    }

    @aa1
    public final String component29() {
        return this.mFileName;
    }

    @aa1
    public final String component3() {
        return this.mLocalTime;
    }

    @aa1
    public final String component30() {
        return this.mTaskId;
    }

    public final int component31() {
        return this.mModel;
    }

    @aa1
    public final String component4() {
        return this.mName;
    }

    @aa1
    public final String component5() {
        return this.mPath;
    }

    public final long component6() {
        return this.mSize;
    }

    public final int component7() {
        return this.mWidth;
    }

    public final int component8() {
        return this.mHeight;
    }

    public final long component9() {
        return this.mDuration;
    }

    @aa1
    public final RecordDeviceFile copy(long r38, long r40, @aa1 String r42, @aa1 String r43, @aa1 String r44, long r45, int r47, int r48, long r49, @aa1 String r51, int r52, int r53, @aa1 String r54, int r55, int r56, int r57, int r58, @aa1 String r59, boolean r60, @aa1 String r61, @aa1 String r62, int r63, int r64, int r65, int r66, @aa1 String r67, int r68, @aa1 String r69, @aa1 String r70, @aa1 String r71, int r72) {
        Intrinsics.X0O(r42, "mLocalTime");
        Intrinsics.X0O(r43, "mName");
        Intrinsics.X0O(r44, "mPath");
        Intrinsics.X0O(r51, "mThumbnail");
        Intrinsics.X0O(r54, "mContent");
        Intrinsics.X0O(r59, "mProcessPath");
        Intrinsics.X0O(r61, "mUrl");
        Intrinsics.X0O(r62, "mRemotePath");
        Intrinsics.X0O(r67, "mReservedText");
        Intrinsics.X0O(r69, "mSummaryReportText");
        Intrinsics.X0O(r70, "mFileName");
        Intrinsics.X0O(r71, "mTaskId");
        return new RecordDeviceFile(r38, r40, r42, r43, r44, r45, r47, r48, r49, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72);
    }

    public boolean equals(@tb1 Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof RecordDeviceFile) == true) goto L8;
        return false;
    L8:
        RecordDeviceFile r9 = (RecordDeviceFile) r8;
        if (this.mId == r9.mId) goto L12;
        return false;
    L12:
        if (this.mTime == r9.mTime) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.mLocalTime, r9.mLocalTime) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.mName, r9.mName) == true) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.mPath, r9.mPath) == true) goto L24;
        return false;
    L24:
        if (this.mSize == r9.mSize) goto L27;
        return false;
    L27:
        if (this.mWidth == r9.mWidth) goto L30;
        return false;
    L30:
        if (this.mHeight == r9.mHeight) goto L33;
        return false;
    L33:
        if (this.mDuration == r9.mDuration) goto L36;
        return false;
    L36:
        if (Intrinsics.XOO0ii0(this.mThumbnail, r9.mThumbnail) == true) goto L39;
        return false;
    L39:
        if (this.mFileType == r9.mFileType) goto L42;
        return false;
    L42:
        if (this.mIsFavority == r9.mIsFavority) goto L45;
        return false;
    L45:
        if (Intrinsics.XOO0ii0(this.mContent, r9.mContent) == true) goto L48;
        return false;
    L48:
        if (this.mIsSync == r9.mIsSync) goto L51;
        return false;
    L51:
        if (this.mIsDelete == r9.mIsDelete) goto L54;
        return false;
    L54:
        if (this.mProcessType == r9.mProcessType) goto L57;
        return false;
    L57:
        if (this.mProcessStatus == r9.mProcessStatus) goto L60;
        return false;
    L60:
        if (Intrinsics.XOO0ii0(this.mProcessPath, r9.mProcessPath) == true) goto L63;
        return false;
    L63:
        if (this.isSelected == r9.isSelected) goto L66;
        return false;
    L66:
        if (Intrinsics.XOO0ii0(this.mUrl, r9.mUrl) == true) goto L69;
        return false;
    L69:
        if (Intrinsics.XOO0ii0(this.mRemotePath, r9.mRemotePath) == true) goto L72;
        return false;
    L72:
        if (this.mPosition == r9.mPosition) goto L75;
        return false;
    L75:
        if (this.mIsRead == r9.mIsRead) goto L78;
        return false;
    L78:
        if (this.mIsConversion == r9.mIsConversion) goto L81;
        return false;
    L81:
        if (this.mReservedTextType == r9.mReservedTextType) goto L84;
        return false;
    L84:
        if (Intrinsics.XOO0ii0(this.mReservedText, r9.mReservedText) == true) goto L87;
        return false;
    L87:
        if (this.mIsSummaryReport == r9.mIsSummaryReport) goto L90;
        return false;
    L90:
        if (Intrinsics.XOO0ii0(this.mSummaryReportText, r9.mSummaryReportText) == true) goto L93;
        return false;
    L93:
        if (Intrinsics.XOO0ii0(this.mFileName, r9.mFileName) == true) goto L96;
        return false;
    L96:
        if (Intrinsics.XOO0ii0(this.mTaskId, r9.mTaskId) == true) goto L99;
        return false;
    L99:
        if (this.mModel == r9.mModel) goto L101;
        return false;
    L101:
        return true;
    }

    @aa1
    public final String getMContent() {
        return this.mContent;
    }

    public final long getMDuration() {
        return this.mDuration;
    }

    @aa1
    public final String getMFileName() {
        return this.mFileName;
    }

    public final int getMFileType() {
        return this.mFileType;
    }

    public final int getMHeight() {
        return this.mHeight;
    }

    public final long getMId() {
        return this.mId;
    }

    public final int getMIsConversion() {
        return this.mIsConversion;
    }

    public final int getMIsDelete() {
        return this.mIsDelete;
    }

    public final int getMIsFavority() {
        return this.mIsFavority;
    }

    public final int getMIsRead() {
        return this.mIsRead;
    }

    public final int getMIsSummaryReport() {
        return this.mIsSummaryReport;
    }

    public final int getMIsSync() {
        return this.mIsSync;
    }

    @aa1
    public final String getMLocalTime() {
        return this.mLocalTime;
    }

    public final int getMModel() {
        return this.mModel;
    }

    @aa1
    public final String getMName() {
        return this.mName;
    }

    @aa1
    public final String getMPath() {
        return this.mPath;
    }

    public final int getMPosition() {
        return this.mPosition;
    }

    @aa1
    public final String getMProcessPath() {
        return this.mProcessPath;
    }

    public final int getMProcessStatus() {
        return this.mProcessStatus;
    }

    public final int getMProcessType() {
        return this.mProcessType;
    }

    @aa1
    public final String getMRemotePath() {
        return this.mRemotePath;
    }

    @aa1
    public final String getMReservedText() {
        return this.mReservedText;
    }

    public final int getMReservedTextType() {
        return this.mReservedTextType;
    }

    public final long getMSize() {
        return this.mSize;
    }

    @aa1
    public final String getMSummaryReportText() {
        return this.mSummaryReportText;
    }

    @aa1
    public final String getMTaskId() {
        return this.mTaskId;
    }

    @aa1
    public final String getMThumbnail() {
        return this.mThumbnail;
    }

    public final long getMTime() {
        return this.mTime;
    }

    @aa1
    public final String getMUrl() {
        return this.mUrl;
    }

    public final int getMWidth() {
        return this.mWidth;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Long.hashCode(this.mId) * 31) + Long.hashCode(this.mTime)) * 31) + this.mLocalTime.hashCode()) * 31) + this.mName.hashCode()) * 31) + this.mPath.hashCode()) * 31) + Long.hashCode(this.mSize)) * 31) + Integer.hashCode(this.mWidth)) * 31) + Integer.hashCode(this.mHeight)) * 31) + Long.hashCode(this.mDuration)) * 31) + this.mThumbnail.hashCode()) * 31) + Integer.hashCode(this.mFileType)) * 31) + Integer.hashCode(this.mIsFavority)) * 31) + this.mContent.hashCode()) * 31) + Integer.hashCode(this.mIsSync)) * 31) + Integer.hashCode(this.mIsDelete)) * 31) + Integer.hashCode(this.mProcessType)) * 31) + Integer.hashCode(this.mProcessStatus)) * 31) + this.mProcessPath.hashCode()) * 31) + Boolean.hashCode(this.isSelected)) * 31) + this.mUrl.hashCode()) * 31) + this.mRemotePath.hashCode()) * 31) + Integer.hashCode(this.mPosition)) * 31) + Integer.hashCode(this.mIsRead)) * 31) + Integer.hashCode(this.mIsConversion)) * 31) + Integer.hashCode(this.mReservedTextType)) * 31) + this.mReservedText.hashCode()) * 31) + Integer.hashCode(this.mIsSummaryReport)) * 31) + this.mSummaryReportText.hashCode()) * 31) + this.mFileName.hashCode()) * 31) + this.mTaskId.hashCode()) * 31) + Integer.hashCode(this.mModel);
    }

    public final boolean isProcessingStatus() {
        int r0 = this.mProcessStatus;
        if (r0 != PROCESS_STATUS_PENDING) goto L5;
        return true;
    L5:
        if (r0 == PROCESS_STATUS_PROCESSING) goto L11;
        return false;
    L11:
        return true;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setMContent(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mContent = r2;
    }

    public final void setMDuration(long r1) {
        this.mDuration = r1;
    }

    public final void setMFileName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mFileName = r2;
    }

    public final void setMFileType(int r1) {
        this.mFileType = r1;
    }

    public final void setMHeight(int r1) {
        this.mHeight = r1;
    }

    public final void setMId(long r1) {
        this.mId = r1;
    }

    public final void setMIsConversion(int r1) {
        this.mIsConversion = r1;
    }

    public final void setMIsDelete(int r1) {
        this.mIsDelete = r1;
    }

    public final void setMIsFavority(int r1) {
        this.mIsFavority = r1;
    }

    public final void setMIsRead(int r1) {
        this.mIsRead = r1;
    }

    public final void setMIsSummaryReport(int r1) {
        this.mIsSummaryReport = r1;
    }

    public final void setMIsSync(int r1) {
        this.mIsSync = r1;
    }

    public final void setMLocalTime(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mLocalTime = r2;
    }

    public final void setMModel(int r1) {
        this.mModel = r1;
    }

    public final void setMName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mName = r2;
    }

    public final void setMPath(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mPath = r2;
    }

    public final void setMPosition(int r1) {
        this.mPosition = r1;
    }

    public final void setMProcessPath(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mProcessPath = r2;
    }

    public final void setMProcessStatus(int r1) {
        this.mProcessStatus = r1;
    }

    public final void setMProcessType(int r1) {
        this.mProcessType = r1;
    }

    public final void setMRemotePath(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mRemotePath = r2;
    }

    public final void setMReservedText(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mReservedText = r2;
    }

    public final void setMReservedTextType(int r1) {
        this.mReservedTextType = r1;
    }

    public final void setMSize(long r1) {
        this.mSize = r1;
    }

    public final void setMSummaryReportText(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mSummaryReportText = r2;
    }

    public final void setMTaskId(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mTaskId = r2;
    }

    public final void setMThumbnail(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mThumbnail = r2;
    }

    public final void setMTime(long r1) {
        this.mTime = r1;
    }

    public final void setMUrl(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mUrl = r2;
    }

    public final void setMWidth(int r1) {
        this.mWidth = r1;
    }

    public final void setSelected(boolean r1) {
        this.isSelected = r1;
    }

    @aa1
    public String toString() {
        return "RecordDeviceFile(mId=" + this.mId + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mName=" + this.mName + ", mPath=" + this.mPath + ", mSize=" + this.mSize + ", mWidth=" + this.mWidth + ", mHeight=" + this.mHeight + ", mDuration=" + this.mDuration + ", mThumbnail=" + this.mThumbnail + ", mFileType=" + this.mFileType + ", mIsFavority=" + this.mIsFavority + ", mContent=" + this.mContent + ", mIsSync=" + this.mIsSync + ", mIsDelete=" + this.mIsDelete + ", mProcessType=" + this.mProcessType + ", mProcessStatus=" + this.mProcessStatus + ", mProcessPath=" + this.mProcessPath + ", isSelected=" + this.isSelected + ", mUrl=" + this.mUrl + ", mRemotePath=" + this.mRemotePath + ", mPosition=" + this.mPosition + ", mIsRead=" + this.mIsRead + ", mIsConversion=" + this.mIsConversion + ", mReservedTextType=" + this.mReservedTextType + ", mReservedText=" + this.mReservedText + ", mIsSummaryReport=" + this.mIsSummaryReport + ", mSummaryReportText=" + this.mSummaryReportText + ", mFileName=" + this.mFileName + ", mTaskId=" + this.mTaskId + ", mModel=" + this.mModel + I000IiI1O.iO.iO;
    }

    public RecordDeviceFile(long r15, long r17, @aa1 String r19, @aa1 String r20, @aa1 String r21, long r22, int r24, int r25, long r26, @aa1 String r28, int r29, int r30, @aa1 String r31, int r32, int r33, int r34, int r35, @aa1 String r36, boolean r37, @aa1 String r38, @aa1 String r39, int r40, int r41, int r42, int r43, @aa1 String r44, int r45, @aa1 String r46, @aa1 String r47, @aa1 String r48, int r49) {
        Intrinsics.X0O(r19, "mLocalTime");
        Intrinsics.X0O(r20, "mName");
        Intrinsics.X0O(r21, "mPath");
        Intrinsics.X0O(r28, "mThumbnail");
        Intrinsics.X0O(r31, "mContent");
        Intrinsics.X0O(r36, "mProcessPath");
        Intrinsics.X0O(r38, "mUrl");
        Intrinsics.X0O(r39, "mRemotePath");
        Intrinsics.X0O(r44, "mReservedText");
        Intrinsics.X0O(r46, "mSummaryReportText");
        Intrinsics.X0O(r47, "mFileName");
        Intrinsics.X0O(r48, "mTaskId");
        this.mId = r15;
        this.mTime = r17;
        this.mLocalTime = r19;
        this.mName = r20;
        this.mPath = r21;
        this.mSize = r22;
        this.mWidth = r24;
        this.mHeight = r25;
        this.mDuration = r26;
        this.mThumbnail = r28;
        this.mFileType = r29;
        this.mIsFavority = r30;
        this.mContent = r31;
        this.mIsSync = r32;
        this.mIsDelete = r33;
        this.mProcessType = r34;
        this.mProcessStatus = r35;
        this.mProcessPath = r36;
        this.isSelected = r37;
        this.mUrl = r38;
        this.mRemotePath = r39;
        this.mPosition = r40;
        this.mIsRead = r41;
        this.mIsConversion = r42;
        this.mReservedTextType = r43;
        this.mReservedText = r44;
        this.mIsSummaryReport = r45;
        this.mSummaryReportText = r46;
        this.mFileName = r47;
        this.mTaskId = r48;
        this.mModel = r49;
    }

    public /* synthetic */ RecordDeviceFile(long r34, long r36, String r38, String r39, String r40, long r41, int r43, int r44, long r45, String r47, int r48, int r49, String r50, int r51, int r52, int r53, int r54, String r55, boolean r56, String r57, String r58, int r59, int r60, int r61, int r62, String r63, int r64, String r65, String r66, String r67, int r68, int r69, DefaultConstructorMarker r70) {
        if ((r69 & 1) == 0) goto L5;
        long r4 = 0;
    L7:
        if ((r69 & 2) == 0) goto L9;
        long r6 = new Date().getTime();
    L11:
        if ((r69 & 4) == 0) goto L13;
        String r1 = O0X11OiO.XO0O10().format(Long.valueOf(r6));
        Intrinsics.O10IXXX0X(r1, "format(...)");
    L14:
        String r9 = "";
        if ((r69 & 8) == 0) goto L17;
        String r8 = "";
    L19:
        if ((r69 & 16) == 0) goto L21;
        String r10 = "";
    L23:
        if ((r69 & 32) == 0) goto L25;
        long r11 = 0;
    L27:
        if ((r69 & 64) == 0) goto L29;
        int r13 = 0;
    L31:
        if ((r69 & 128) == 0) goto L33;
        int r15 = 0;
    L35:
        if ((r69 & 256) == 0) goto L37;
        long r16 = 0;
    L39:
        if ((r69 & 512) == 0) goto L41;
        String r2 = "";
    L43:
        if ((r69 & 1024) == 0) goto L45;
        int r3 = 0;
    L47:
        if ((r69 & 2048) == 0) goto L49;
        int r14 = 0;
    L50:
        String r35 = r1;
        if ((r69 & 4096) == 0) goto L53;
        String r5 = "";
    L54:
        String r37 = r5;
        if ((r69 & 8192) == 0) goto L57;
        int r7 = 0;
    L58:
        int r310 = r7;
        if ((r69 & 16384) == 0) goto L61;
        int r12 = 0;
    L63:
        if ((r69 & 32768) == 0) goto L65;
        int r18 = PROCESS_TYPE_DEFAULT;
    L67:
        if ((r69 & 65536) == 0) goto L69;
        int r19 = PROCESS_STATUS_DEFAULT;
    L71:
        if ((r69 & 131072) == 0) goto L73;
        String r20 = "";
    L75:
        if ((r69 & 262144) == 0) goto L77;
        boolean r21 = false;
    L79:
        if ((r69 & 524288) == 0) goto L81;
        String r22 = "";
    L83:
        if ((r69 & 1048576) == 0) goto L85;
        String r23 = "";
    L87:
        if ((r69 & 2097152) == 0) goto L89;
        int r24 = 0;
    L91:
        if ((r69 & 4194304) == 0) goto L93;
        int r25 = 0;
    L95:
        if ((r69 & 8388608) == 0) goto L97;
        int r26 = 0;
    L99:
        if ((r69 & 16777216) == 0) goto L101;
        int r27 = 0;
    L103:
        if ((r69 & 33554432) == 0) goto L105;
        String r28 = "";
    L107:
        if ((r69 & 67108864) == 0) goto L109;
        int r29 = 0;
    L111:
        if ((r69 & 134217728) == 0) goto L113;
        String r30 = "";
    L115:
        if ((r69 & 268435456) == 0) goto L117;
        String r31 = "";
    L119:
        if ((r69 & 536870912) != 0) goto L123;
        r9 = r67;
    L123:
        if ((r69 & 1073741824) == 0) goto L126;
        int r610 = 0;
    L127:
        this(r4, r6, r35, r8, r10, r11, r13, r15, r16, r2, r3, r14, r37, r310, r12, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r9, r610);
        return;
    L126:
        r610 = r68;
        goto L127
    L117:
        r31 = r66;
        goto L119
    L113:
        r30 = r65;
        goto L115
    L109:
        r29 = r64;
        goto L111
    L105:
        r28 = r63;
        goto L107
    L101:
        r27 = r62;
        goto L103
    L97:
        r26 = r61;
        goto L99
    L93:
        r25 = r60;
        goto L95
    L89:
        r24 = r59;
        goto L91
    L85:
        r23 = r58;
        goto L87
    L81:
        r22 = r57;
        goto L83
    L77:
        r21 = r56;
        goto L79
    L73:
        r20 = r55;
        goto L75
    L69:
        r19 = r54;
        goto L71
    L65:
        r18 = r53;
        goto L67
    L61:
        r12 = r52;
        goto L63
    L57:
        r7 = r51;
        goto L58
    L53:
        r5 = r50;
        goto L54
    L49:
        r14 = r49;
        goto L50
    L45:
        r3 = r48;
        goto L47
    L41:
        r2 = r47;
        goto L43
    L37:
        r16 = r45;
        goto L39
    L33:
        r15 = r44;
        goto L35
    L29:
        r13 = r43;
        goto L31
    L25:
        r11 = r41;
        goto L27
    L21:
        r10 = r40;
        goto L23
    L17:
        r8 = r39;
        goto L19
    L13:
        r1 = r38;
        goto L14
    L9:
        r6 = r36;
        goto L11
    L5:
        r4 = r34;
        goto L7
    }
}
