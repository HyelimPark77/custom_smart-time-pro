package com.sma.smartv3.p608db.entity;

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
    private static final int PROCESS_STATUS_DEFAULT = 0;
    private static final int PROCESS_TYPE_DEFAULT = 0;
    private static final int TYPE_AUDIO_ZORE = 0;
    private static final int TYPE_UNKNOWN = 0;

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

    @aa1
    public static final Companion Companion = new Companion(null);
    private static final int RESERVED_TYPE_TRANSCRIPTION_JSON = 1;
    private static final int RESERVED_TYPE_AI_SUMMARY_JSON = 2;
    private static final int RESERVED_TYPE_AI_SUMMARY_V3_JSON = 3;
    private static final int RESERVED_TYPE_TRY_IT_NOW = 4;
    private static final int RESERVED_TYPE_USE_RECORDING_CARD = 5;
    private static final int RESERVED_TYPE_RECORD_USING_APP = 6;
    private static final int RESERVED_TYPE_EDIT = 7;
    private static final int TYPE_IMAGE = 1;
    private static final int TYPE_VIDEO = 2;
    private static final int TYPE_AUDIO = 3;
    private static final int TYPE_AUDIO_FOUR = 4;
    private static final int TYPE_GUIDE_DATA = 5;
    private static final int PROCESS_TYPE_VS_IMAGE = 1;
    private static final int PROCESS_TYPE_VS_JZ = 2;
    private static final int PROCESS_TYPE_TRANSCODE = 3;
    private static final int PROCESS_STATUS_NOT_PROCESSED = -1;
    private static final int PROCESS_STATUS_PENDING = 1;
    private static final int PROCESS_STATUS_PROCESSING = 2;
    private static final int PROCESS_STATUS_COMPLETED = 3;
    private static final int PROCESS_STATUS_FAILED = 4;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
        
            if (r2.equals("jpeg") == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
        
            if (r2.equals("JPEG") == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
        
            if (r2.equals("wav") == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
        
            if (r2.equals("pcm") == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        
            if (r2.equals("mov") == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
        
            if (r2.equals("mp4") == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
        
            if (r2.equals("mp3") == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x007d, code lost:
        
            if (r2.equals("jpg") == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
        
            if (r2.equals("avi") == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x008f, code lost:
        
            if (r2.equals("aac") == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0096, code lost:
        
            return getTYPE_AUDIO();
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x009d, code lost:
        
            if (r2.equals("MOV") == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00a4, code lost:
        
            return getTYPE_VIDEO();
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00ab, code lost:
        
            if (r2.equals("JPG") == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00b6, code lost:
        
            return getTYPE_IMAGE();
         */
        /* JADX WARN: Code restructure failed: missing block: B:6:0x0028, code lost:
        
            if (r2.equals("webp") == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
        
            if (r2.equals("opus") == false) goto L50;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int getFileType(@aa1 String name) {
            Intrinsics.X0O(name, "name");
            String fileExtension = FileUtils.getFileExtension(name);
            Intrinsics.O10IXXX0X(fileExtension, "getFileExtension(...)");
            String lowerCase = fileExtension.toLowerCase(Locale.ROOT);
            Intrinsics.O10IXXX0X(lowerCase, "toLowerCase(...)");
            switch (lowerCase.hashCode()) {
                case 73665:
                    break;
                case 76532:
                    break;
                case 96323:
                    break;
                case 96980:
                    break;
                case 105441:
                    break;
                case 108272:
                    break;
                case 108273:
                    break;
                case 108308:
                    break;
                case 110810:
                    break;
                case 117484:
                    break;
                case 2283624:
                    break;
                case 3268712:
                    break;
                case 3418175:
                    break;
                case 3645340:
                    break;
                default:
                    return getTYPE_UNKNOWN();
            }
        }

        public final int getPROCESS_STATUS_COMPLETED() {
            return RecordDeviceFile.PROCESS_STATUS_COMPLETED;
        }

        public final int getPROCESS_STATUS_DEFAULT() {
            return RecordDeviceFile.PROCESS_STATUS_DEFAULT;
        }

        public final int getPROCESS_STATUS_FAILED() {
            return RecordDeviceFile.PROCESS_STATUS_FAILED;
        }

        public final int getPROCESS_STATUS_NOT_PROCESSED() {
            return RecordDeviceFile.PROCESS_STATUS_NOT_PROCESSED;
        }

        public final int getPROCESS_STATUS_PENDING() {
            return RecordDeviceFile.PROCESS_STATUS_PENDING;
        }

        public final int getPROCESS_STATUS_PROCESSING() {
            return RecordDeviceFile.PROCESS_STATUS_PROCESSING;
        }

        public final int getPROCESS_TYPE_DEFAULT() {
            return RecordDeviceFile.PROCESS_TYPE_DEFAULT;
        }

        public final int getPROCESS_TYPE_TRANSCODE() {
            return RecordDeviceFile.PROCESS_TYPE_TRANSCODE;
        }

        public final int getPROCESS_TYPE_VS_IMAGE() {
            return RecordDeviceFile.PROCESS_TYPE_VS_IMAGE;
        }

        public final int getPROCESS_TYPE_VS_JZ() {
            return RecordDeviceFile.PROCESS_TYPE_VS_JZ;
        }

        public final int getRESERVED_TYPE_AI_SUMMARY_JSON() {
            return RecordDeviceFile.RESERVED_TYPE_AI_SUMMARY_JSON;
        }

        public final int getRESERVED_TYPE_AI_SUMMARY_V3_JSON() {
            return RecordDeviceFile.RESERVED_TYPE_AI_SUMMARY_V3_JSON;
        }

        public final int getRESERVED_TYPE_EDIT() {
            return RecordDeviceFile.RESERVED_TYPE_EDIT;
        }

        public final int getRESERVED_TYPE_RECORD_USING_APP() {
            return RecordDeviceFile.RESERVED_TYPE_RECORD_USING_APP;
        }

        public final int getRESERVED_TYPE_TRANSCRIPTION_JSON() {
            return RecordDeviceFile.RESERVED_TYPE_TRANSCRIPTION_JSON;
        }

        public final int getRESERVED_TYPE_TRY_IT_NOW() {
            return RecordDeviceFile.RESERVED_TYPE_TRY_IT_NOW;
        }

        public final int getRESERVED_TYPE_USE_RECORDING_CARD() {
            return RecordDeviceFile.RESERVED_TYPE_USE_RECORDING_CARD;
        }

        public final int getTYPE_AUDIO() {
            return RecordDeviceFile.TYPE_AUDIO;
        }

        public final int getTYPE_AUDIO_FOUR() {
            return RecordDeviceFile.TYPE_AUDIO_FOUR;
        }

        public final int getTYPE_AUDIO_ZORE() {
            return RecordDeviceFile.TYPE_AUDIO_ZORE;
        }

        public final int getTYPE_GUIDE_DATA() {
            return RecordDeviceFile.TYPE_GUIDE_DATA;
        }

        public final int getTYPE_IMAGE() {
            return RecordDeviceFile.TYPE_IMAGE;
        }

        public final int getTYPE_UNKNOWN() {
            return RecordDeviceFile.TYPE_UNKNOWN;
        }

        public final int getTYPE_VIDEO() {
            return RecordDeviceFile.TYPE_VIDEO;
        }

        private Companion() {
        }
    }

    public RecordDeviceFile() {
        this(0L, 0L, null, null, null, 0L, 0, 0, 0L, null, 0, 0, null, 0, 0, 0, 0, null, false, null, null, 0, 0, 0, 0, null, 0, null, null, null, 0, Integer.MAX_VALUE, null);
    }

    public static /* synthetic */ RecordDeviceFile copy$default(RecordDeviceFile recordDeviceFile, long j, long j2, String str, String str2, String str3, long j3, int i, int i2, long j4, String str4, int i3, int i4, String str5, int i5, int i6, int i7, int i8, String str6, boolean z, String str7, String str8, int i9, int i10, int i11, int i12, String str9, int i13, String str10, String str11, String str12, int i14, int i15, Object obj) {
        int i16;
        String str13;
        long j5 = (i15 & 1) != 0 ? recordDeviceFile.mId : j;
        long j6 = (i15 & 2) != 0 ? recordDeviceFile.mTime : j2;
        String str14 = (i15 & 4) != 0 ? recordDeviceFile.mLocalTime : str;
        String str15 = (i15 & 8) != 0 ? recordDeviceFile.mName : str2;
        String str16 = (i15 & 16) != 0 ? recordDeviceFile.mPath : str3;
        long j7 = (i15 & 32) != 0 ? recordDeviceFile.mSize : j3;
        int i17 = (i15 & 64) != 0 ? recordDeviceFile.mWidth : i;
        int i18 = (i15 & 128) != 0 ? recordDeviceFile.mHeight : i2;
        long j8 = (i15 & 256) != 0 ? recordDeviceFile.mDuration : j4;
        String str17 = (i15 & 512) != 0 ? recordDeviceFile.mThumbnail : str4;
        long j9 = j5;
        int i19 = (i15 & 1024) != 0 ? recordDeviceFile.mFileType : i3;
        int i20 = (i15 & 2048) != 0 ? recordDeviceFile.mIsFavority : i4;
        int i21 = i19;
        String str18 = (i15 & 4096) != 0 ? recordDeviceFile.mContent : str5;
        int i22 = (i15 & 8192) != 0 ? recordDeviceFile.mIsSync : i5;
        int i23 = (i15 & 16384) != 0 ? recordDeviceFile.mIsDelete : i6;
        int i24 = (i15 & 32768) != 0 ? recordDeviceFile.mProcessType : i7;
        int i25 = (i15 & 65536) != 0 ? recordDeviceFile.mProcessStatus : i8;
        String str19 = (i15 & 131072) != 0 ? recordDeviceFile.mProcessPath : str6;
        boolean z2 = (i15 & 262144) != 0 ? recordDeviceFile.isSelected : z;
        String str20 = (i15 & 524288) != 0 ? recordDeviceFile.mUrl : str7;
        String str21 = (i15 & 1048576) != 0 ? recordDeviceFile.mRemotePath : str8;
        int i26 = (i15 & 2097152) != 0 ? recordDeviceFile.mPosition : i9;
        int i27 = (i15 & 4194304) != 0 ? recordDeviceFile.mIsRead : i10;
        int i28 = (i15 & 8388608) != 0 ? recordDeviceFile.mIsConversion : i11;
        int i29 = (i15 & 16777216) != 0 ? recordDeviceFile.mReservedTextType : i12;
        String str22 = (i15 & 33554432) != 0 ? recordDeviceFile.mReservedText : str9;
        int i30 = (i15 & 67108864) != 0 ? recordDeviceFile.mIsSummaryReport : i13;
        String str23 = (i15 & 134217728) != 0 ? recordDeviceFile.mSummaryReportText : str10;
        String str24 = (i15 & 268435456) != 0 ? recordDeviceFile.mFileName : str11;
        String str25 = (i15 & 536870912) != 0 ? recordDeviceFile.mTaskId : str12;
        if ((i15 & 1073741824) != 0) {
            str13 = str25;
            i16 = recordDeviceFile.mModel;
        } else {
            i16 = i14;
            str13 = str25;
        }
        return recordDeviceFile.copy(j9, j6, str14, str15, str16, j7, i17, i18, j8, str17, i21, i20, str18, i22, i23, i24, i25, str19, z2, str20, str21, i26, i27, i28, i29, str22, i30, str23, str24, str13, i16);
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
    public final RecordDeviceFile copy(long j, long j2, @aa1 String mLocalTime, @aa1 String mName, @aa1 String mPath, long j3, int i, int i2, long j4, @aa1 String mThumbnail, int i3, int i4, @aa1 String mContent, int i5, int i6, int i7, int i8, @aa1 String mProcessPath, boolean z, @aa1 String mUrl, @aa1 String mRemotePath, int i9, int i10, int i11, int i12, @aa1 String mReservedText, int i13, @aa1 String mSummaryReportText, @aa1 String mFileName, @aa1 String mTaskId, int i14) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        Intrinsics.X0O(mName, "mName");
        Intrinsics.X0O(mPath, "mPath");
        Intrinsics.X0O(mThumbnail, "mThumbnail");
        Intrinsics.X0O(mContent, "mContent");
        Intrinsics.X0O(mProcessPath, "mProcessPath");
        Intrinsics.X0O(mUrl, "mUrl");
        Intrinsics.X0O(mRemotePath, "mRemotePath");
        Intrinsics.X0O(mReservedText, "mReservedText");
        Intrinsics.X0O(mSummaryReportText, "mSummaryReportText");
        Intrinsics.X0O(mFileName, "mFileName");
        Intrinsics.X0O(mTaskId, "mTaskId");
        return new RecordDeviceFile(j, j2, mLocalTime, mName, mPath, j3, i, i2, j4, mThumbnail, i3, i4, mContent, i5, i6, i7, i8, mProcessPath, z, mUrl, mRemotePath, i9, i10, i11, i12, mReservedText, i13, mSummaryReportText, mFileName, mTaskId, i14);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecordDeviceFile)) {
            return false;
        }
        RecordDeviceFile recordDeviceFile = (RecordDeviceFile) obj;
        return this.mId == recordDeviceFile.mId && this.mTime == recordDeviceFile.mTime && Intrinsics.XOO0ii0(this.mLocalTime, recordDeviceFile.mLocalTime) && Intrinsics.XOO0ii0(this.mName, recordDeviceFile.mName) && Intrinsics.XOO0ii0(this.mPath, recordDeviceFile.mPath) && this.mSize == recordDeviceFile.mSize && this.mWidth == recordDeviceFile.mWidth && this.mHeight == recordDeviceFile.mHeight && this.mDuration == recordDeviceFile.mDuration && Intrinsics.XOO0ii0(this.mThumbnail, recordDeviceFile.mThumbnail) && this.mFileType == recordDeviceFile.mFileType && this.mIsFavority == recordDeviceFile.mIsFavority && Intrinsics.XOO0ii0(this.mContent, recordDeviceFile.mContent) && this.mIsSync == recordDeviceFile.mIsSync && this.mIsDelete == recordDeviceFile.mIsDelete && this.mProcessType == recordDeviceFile.mProcessType && this.mProcessStatus == recordDeviceFile.mProcessStatus && Intrinsics.XOO0ii0(this.mProcessPath, recordDeviceFile.mProcessPath) && this.isSelected == recordDeviceFile.isSelected && Intrinsics.XOO0ii0(this.mUrl, recordDeviceFile.mUrl) && Intrinsics.XOO0ii0(this.mRemotePath, recordDeviceFile.mRemotePath) && this.mPosition == recordDeviceFile.mPosition && this.mIsRead == recordDeviceFile.mIsRead && this.mIsConversion == recordDeviceFile.mIsConversion && this.mReservedTextType == recordDeviceFile.mReservedTextType && Intrinsics.XOO0ii0(this.mReservedText, recordDeviceFile.mReservedText) && this.mIsSummaryReport == recordDeviceFile.mIsSummaryReport && Intrinsics.XOO0ii0(this.mSummaryReportText, recordDeviceFile.mSummaryReportText) && Intrinsics.XOO0ii0(this.mFileName, recordDeviceFile.mFileName) && Intrinsics.XOO0ii0(this.mTaskId, recordDeviceFile.mTaskId) && this.mModel == recordDeviceFile.mModel;
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
        int i = this.mProcessStatus;
        return i == PROCESS_STATUS_PENDING || i == PROCESS_STATUS_PROCESSING;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setMContent(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mContent = str;
    }

    public final void setMDuration(long j) {
        this.mDuration = j;
    }

    public final void setMFileName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mFileName = str;
    }

    public final void setMFileType(int i) {
        this.mFileType = i;
    }

    public final void setMHeight(int i) {
        this.mHeight = i;
    }

    public final void setMId(long j) {
        this.mId = j;
    }

    public final void setMIsConversion(int i) {
        this.mIsConversion = i;
    }

    public final void setMIsDelete(int i) {
        this.mIsDelete = i;
    }

    public final void setMIsFavority(int i) {
        this.mIsFavority = i;
    }

    public final void setMIsRead(int i) {
        this.mIsRead = i;
    }

    public final void setMIsSummaryReport(int i) {
        this.mIsSummaryReport = i;
    }

    public final void setMIsSync(int i) {
        this.mIsSync = i;
    }

    public final void setMLocalTime(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mLocalTime = str;
    }

    public final void setMModel(int i) {
        this.mModel = i;
    }

    public final void setMName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mName = str;
    }

    public final void setMPath(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mPath = str;
    }

    public final void setMPosition(int i) {
        this.mPosition = i;
    }

    public final void setMProcessPath(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mProcessPath = str;
    }

    public final void setMProcessStatus(int i) {
        this.mProcessStatus = i;
    }

    public final void setMProcessType(int i) {
        this.mProcessType = i;
    }

    public final void setMRemotePath(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mRemotePath = str;
    }

    public final void setMReservedText(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mReservedText = str;
    }

    public final void setMReservedTextType(int i) {
        this.mReservedTextType = i;
    }

    public final void setMSize(long j) {
        this.mSize = j;
    }

    public final void setMSummaryReportText(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mSummaryReportText = str;
    }

    public final void setMTaskId(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mTaskId = str;
    }

    public final void setMThumbnail(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mThumbnail = str;
    }

    public final void setMTime(long j) {
        this.mTime = j;
    }

    public final void setMUrl(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.mUrl = str;
    }

    public final void setMWidth(int i) {
        this.mWidth = i;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    @aa1
    public String toString() {
        return "RecordDeviceFile(mId=" + this.mId + ", mTime=" + this.mTime + ", mLocalTime=" + this.mLocalTime + ", mName=" + this.mName + ", mPath=" + this.mPath + ", mSize=" + this.mSize + ", mWidth=" + this.mWidth + ", mHeight=" + this.mHeight + ", mDuration=" + this.mDuration + ", mThumbnail=" + this.mThumbnail + ", mFileType=" + this.mFileType + ", mIsFavority=" + this.mIsFavority + ", mContent=" + this.mContent + ", mIsSync=" + this.mIsSync + ", mIsDelete=" + this.mIsDelete + ", mProcessType=" + this.mProcessType + ", mProcessStatus=" + this.mProcessStatus + ", mProcessPath=" + this.mProcessPath + ", isSelected=" + this.isSelected + ", mUrl=" + this.mUrl + ", mRemotePath=" + this.mRemotePath + ", mPosition=" + this.mPosition + ", mIsRead=" + this.mIsRead + ", mIsConversion=" + this.mIsConversion + ", mReservedTextType=" + this.mReservedTextType + ", mReservedText=" + this.mReservedText + ", mIsSummaryReport=" + this.mIsSummaryReport + ", mSummaryReportText=" + this.mSummaryReportText + ", mFileName=" + this.mFileName + ", mTaskId=" + this.mTaskId + ", mModel=" + this.mModel + I000IiI1O.C2156iO.f1007iO;
    }

    public RecordDeviceFile(long j, long j2, @aa1 String mLocalTime, @aa1 String mName, @aa1 String mPath, long j3, int i, int i2, long j4, @aa1 String mThumbnail, int i3, int i4, @aa1 String mContent, int i5, int i6, int i7, int i8, @aa1 String mProcessPath, boolean z, @aa1 String mUrl, @aa1 String mRemotePath, int i9, int i10, int i11, int i12, @aa1 String mReservedText, int i13, @aa1 String mSummaryReportText, @aa1 String mFileName, @aa1 String mTaskId, int i14) {
        Intrinsics.X0O(mLocalTime, "mLocalTime");
        Intrinsics.X0O(mName, "mName");
        Intrinsics.X0O(mPath, "mPath");
        Intrinsics.X0O(mThumbnail, "mThumbnail");
        Intrinsics.X0O(mContent, "mContent");
        Intrinsics.X0O(mProcessPath, "mProcessPath");
        Intrinsics.X0O(mUrl, "mUrl");
        Intrinsics.X0O(mRemotePath, "mRemotePath");
        Intrinsics.X0O(mReservedText, "mReservedText");
        Intrinsics.X0O(mSummaryReportText, "mSummaryReportText");
        Intrinsics.X0O(mFileName, "mFileName");
        Intrinsics.X0O(mTaskId, "mTaskId");
        this.mId = j;
        this.mTime = j2;
        this.mLocalTime = mLocalTime;
        this.mName = mName;
        this.mPath = mPath;
        this.mSize = j3;
        this.mWidth = i;
        this.mHeight = i2;
        this.mDuration = j4;
        this.mThumbnail = mThumbnail;
        this.mFileType = i3;
        this.mIsFavority = i4;
        this.mContent = mContent;
        this.mIsSync = i5;
        this.mIsDelete = i6;
        this.mProcessType = i7;
        this.mProcessStatus = i8;
        this.mProcessPath = mProcessPath;
        this.isSelected = z;
        this.mUrl = mUrl;
        this.mRemotePath = mRemotePath;
        this.mPosition = i9;
        this.mIsRead = i10;
        this.mIsConversion = i11;
        this.mReservedTextType = i12;
        this.mReservedText = mReservedText;
        this.mIsSummaryReport = i13;
        this.mSummaryReportText = mSummaryReportText;
        this.mFileName = mFileName;
        this.mTaskId = mTaskId;
        this.mModel = i14;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RecordDeviceFile(long j, long j2, String str, String str2, String str3, long j3, int i, int i2, long j4, String str4, int i3, int i4, String str5, int i5, int i6, int i7, int i8, String str6, boolean z, String str7, String str8, int i9, int i10, int i11, int i12, String str9, int i13, String str10, String str11, String str12, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        String str13;
        long j5 = (i15 & 1) != 0 ? 0L : j;
        long time = (i15 & 2) != 0 ? new Date().getTime() : j2;
        if ((i15 & 4) != 0) {
            str13 = O0X11OiO.XO0O10().format(Long.valueOf(time));
            Intrinsics.O10IXXX0X(str13, "format(...)");
        } else {
            str13 = str;
        }
        this(j5, time, str13, (i15 & 8) != 0 ? "" : str2, (i15 & 16) != 0 ? "" : str3, (i15 & 32) != 0 ? 0L : j3, (i15 & 64) != 0 ? 0 : i, (i15 & 128) != 0 ? 0 : i2, (i15 & 256) != 0 ? 0L : j4, (i15 & 512) != 0 ? "" : str4, (i15 & 1024) != 0 ? 0 : i3, (i15 & 2048) != 0 ? 0 : i4, (i15 & 4096) != 0 ? "" : str5, (i15 & 8192) != 0 ? 0 : i5, (i15 & 16384) != 0 ? 0 : i6, (i15 & 32768) != 0 ? PROCESS_TYPE_DEFAULT : i7, (i15 & 65536) != 0 ? PROCESS_STATUS_DEFAULT : i8, (i15 & 131072) != 0 ? "" : str6, (i15 & 262144) != 0 ? false : z, (i15 & 524288) != 0 ? "" : str7, (i15 & 1048576) != 0 ? "" : str8, (i15 & 2097152) != 0 ? 0 : i9, (i15 & 4194304) != 0 ? 0 : i10, (i15 & 8388608) != 0 ? 0 : i11, (i15 & 16777216) != 0 ? 0 : i12, (i15 & 33554432) != 0 ? "" : str9, (i15 & 67108864) != 0 ? 0 : i13, (i15 & 134217728) != 0 ? "" : str10, (i15 & 268435456) != 0 ? "" : str11, (i15 & 536870912) == 0 ? str12 : "", (i15 & 1073741824) != 0 ? 0 : i14);
    }
}
