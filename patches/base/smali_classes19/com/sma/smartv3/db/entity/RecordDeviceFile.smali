.class public final Lcom/sma/smartv3/db/entity/RecordDeviceFile;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation build Landroidx/room/Entity;
    indices = {
        .subannotation Landroidx/room/Index;
            unique = true
            value = {
                "mTime"
            }
        .end subannotation
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/db/entity/RecordDeviceFile$Companion;
    }
.end annotation


# static fields
.field public static final CONVERSION_FAILED:I = 0x3

.field public static final CONVERSION_NONE:I = 0x0

.field public static final CONVERSION_SUCCESS:I = 0x1

.field public static final Companion:Lcom/sma/smartv3/db/entity/RecordDeviceFile$Companion;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private static final PROCESS_STATUS_COMPLETED:I

.field private static final PROCESS_STATUS_DEFAULT:I

.field private static final PROCESS_STATUS_FAILED:I

.field private static final PROCESS_STATUS_NOT_PROCESSED:I

.field private static final PROCESS_STATUS_PENDING:I

.field private static final PROCESS_STATUS_PROCESSING:I

.field private static final PROCESS_TYPE_DEFAULT:I

.field private static final PROCESS_TYPE_TRANSCODE:I

.field private static final PROCESS_TYPE_VS_IMAGE:I

.field private static final PROCESS_TYPE_VS_JZ:I

.field private static final RESERVED_TYPE_AI_SUMMARY_JSON:I

.field private static final RESERVED_TYPE_AI_SUMMARY_V3_JSON:I

.field private static final RESERVED_TYPE_EDIT:I

.field private static final RESERVED_TYPE_RECORD_USING_APP:I

.field private static final RESERVED_TYPE_TRANSCRIPTION_JSON:I

.field private static final RESERVED_TYPE_TRY_IT_NOW:I

.field private static final RESERVED_TYPE_USE_RECORDING_CARD:I

.field private static final TYPE_AUDIO:I

.field private static final TYPE_AUDIO_FOUR:I

.field private static final TYPE_AUDIO_ZORE:I

.field private static final TYPE_GUIDE_DATA:I

.field private static final TYPE_IMAGE:I

.field private static final TYPE_UNKNOWN:I

.field private static final TYPE_VIDEO:I


# instance fields
.field private isSelected:Z
    .annotation build Landroidx/room/Ignore;
    .end annotation
.end field

.field private mContent:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mDuration:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mFileName:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mFileType:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mHeight:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mId:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Landroidx/room/PrimaryKey;
        autoGenerate = true
    .end annotation
.end field

.field private mIsConversion:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mIsDelete:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mIsFavority:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mIsRead:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mIsSummaryReport:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mIsSync:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mLocalTime:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mModel:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mName:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mPath:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mPosition:I
    .annotation build Landroidx/room/Ignore;
    .end annotation
.end field

.field private mProcessPath:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mProcessStatus:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mProcessType:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mRemotePath:Ljava/lang/String;
    .annotation build Landroidx/room/Ignore;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mReservedText:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mReservedTextType:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mSize:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mSummaryReportText:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mTaskId:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mThumbnail:Ljava/lang/String;
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mTime:J
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field

.field private mUrl:Ljava/lang/String;
    .annotation build Landroidx/room/Ignore;
    .end annotation

    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mWidth:I
    .annotation build Landroidx/room/ColumnInfo;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/sma/smartv3/db/entity/RecordDeviceFile$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->Companion:Lcom/sma/smartv3/db/entity/RecordDeviceFile$Companion;

    const/4 v0, 0x1

    sput v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->RESERVED_TYPE_TRANSCRIPTION_JSON:I

    const/4 v1, 0x2

    sput v1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->RESERVED_TYPE_AI_SUMMARY_JSON:I

    const/4 v2, 0x3

    sput v2, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->RESERVED_TYPE_AI_SUMMARY_V3_JSON:I

    const/4 v3, 0x4

    sput v3, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->RESERVED_TYPE_TRY_IT_NOW:I

    const/4 v4, 0x5

    sput v4, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->RESERVED_TYPE_USE_RECORDING_CARD:I

    const/4 v5, 0x6

    sput v5, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->RESERVED_TYPE_RECORD_USING_APP:I

    const/4 v5, 0x7

    sput v5, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->RESERVED_TYPE_EDIT:I

    sput v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->TYPE_IMAGE:I

    sput v1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->TYPE_VIDEO:I

    sput v2, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->TYPE_AUDIO:I

    sput v3, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->TYPE_AUDIO_FOUR:I

    sput v4, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->TYPE_GUIDE_DATA:I

    sput v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->PROCESS_TYPE_VS_IMAGE:I

    sput v1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->PROCESS_TYPE_VS_JZ:I

    sput v2, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->PROCESS_TYPE_TRANSCODE:I

    const/4 v4, -0x1

    sput v4, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->PROCESS_STATUS_NOT_PROCESSED:I

    sput v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->PROCESS_STATUS_PENDING:I

    sput v1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->PROCESS_STATUS_PROCESSING:I

    sput v2, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->PROCESS_STATUS_COMPLETED:I

    sput v3, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->PROCESS_STATUS_FAILED:I

    return-void
.end method

.method public constructor <init>()V
    .locals 38

    .line 1
    const v36, 0x7fffffff

    const/16 v37, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v37}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JIIJLjava/lang/String;IILjava/lang/String;IIIILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;IIIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JIIJLjava/lang/String;IILjava/lang/String;IIIILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;IIIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 14
    .param p5    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p14    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p17    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p22    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p24    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p25    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p30    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p32    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p33    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p34    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    move-object/from16 v0, p5

    move-object/from16 v1, p6

    move-object/from16 v2, p7

    move-object/from16 v3, p14

    move-object/from16 v4, p17

    move-object/from16 v5, p22

    move-object/from16 v6, p24

    move-object/from16 v7, p25

    move-object/from16 v8, p30

    move-object/from16 v9, p32

    move-object/from16 v10, p33

    move-object/from16 v11, p34

    const-string v12, "mLocalTime"

    invoke-static {v0, v12}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "mName"

    invoke-static {v1, v12}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "mPath"

    invoke-static {v2, v12}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "mThumbnail"

    invoke-static {v3, v12}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "mContent"

    invoke-static {v4, v12}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "mProcessPath"

    invoke-static {v5, v12}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "mUrl"

    invoke-static {v6, v12}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "mRemotePath"

    invoke-static {v7, v12}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "mReservedText"

    invoke-static {v8, v12}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "mSummaryReportText"

    invoke-static {v9, v12}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "mFileName"

    invoke-static {v10, v12}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v12, "mTaskId"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-wide v12, p1

    .line 3
    iput-wide v12, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mId:J

    move-wide/from16 v12, p3

    .line 4
    iput-wide v12, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mTime:J

    .line 5
    iput-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mLocalTime:Ljava/lang/String;

    .line 6
    iput-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mName:Ljava/lang/String;

    .line 7
    iput-object v2, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mPath:Ljava/lang/String;

    move-wide/from16 v0, p8

    .line 8
    iput-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mSize:J

    move/from16 v0, p10

    .line 9
    iput v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mWidth:I

    move/from16 v0, p11

    .line 10
    iput v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mHeight:I

    move-wide/from16 v0, p12

    .line 11
    iput-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mDuration:J

    .line 12
    iput-object v3, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mThumbnail:Ljava/lang/String;

    move/from16 v0, p15

    .line 13
    iput v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mFileType:I

    move/from16 v0, p16

    .line 14
    iput v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsFavority:I

    .line 15
    iput-object v4, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mContent:Ljava/lang/String;

    move/from16 v0, p18

    .line 16
    iput v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsSync:I

    move/from16 v0, p19

    .line 17
    iput v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsDelete:I

    move/from16 v0, p20

    .line 18
    iput v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mProcessType:I

    move/from16 v0, p21

    .line 19
    iput v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mProcessStatus:I

    .line 20
    iput-object v5, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mProcessPath:Ljava/lang/String;

    move/from16 v0, p23

    .line 21
    iput-boolean v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->isSelected:Z

    .line 22
    iput-object v6, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mUrl:Ljava/lang/String;

    .line 23
    iput-object v7, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mRemotePath:Ljava/lang/String;

    move/from16 v0, p26

    .line 24
    iput v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mPosition:I

    move/from16 v0, p27

    .line 25
    iput v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsRead:I

    move/from16 v0, p28

    .line 26
    iput v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsConversion:I

    move/from16 v0, p29

    .line 27
    iput v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mReservedTextType:I

    .line 28
    iput-object v8, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mReservedText:Ljava/lang/String;

    move/from16 v0, p31

    .line 29
    iput v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsSummaryReport:I

    .line 30
    iput-object v9, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mSummaryReportText:Ljava/lang/String;

    .line 31
    iput-object v10, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mFileName:Ljava/lang/String;

    .line 32
    iput-object v11, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mTaskId:Ljava/lang/String;

    move/from16 v0, p35

    .line 33
    iput v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mModel:I

    return-void
.end method

.method public synthetic constructor <init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JIIJLjava/lang/String;IILjava/lang/String;IIIILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;IIIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 33

    move/from16 v0, p36

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const-wide/16 v4, 0x0

    goto :goto_0

    :cond_0
    move-wide/from16 v4, p1

    :goto_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    .line 34
    new-instance v1, Ljava/util/Date;

    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    goto :goto_1

    :cond_1
    move-wide/from16 v6, p3

    :goto_1
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_2

    .line 35
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->XO0O10()Ljava/text/SimpleDateFormat;

    move-result-object v1

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v1, v8}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v8, "format(...)"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    move-object/from16 v1, p5

    :goto_2
    and-int/lit8 v8, v0, 0x8

    .line 36
    const-string v9, ""

    if-eqz v8, :cond_3

    move-object v8, v9

    goto :goto_3

    :cond_3
    move-object/from16 v8, p6

    :goto_3
    and-int/lit8 v10, v0, 0x10

    if-eqz v10, :cond_4

    move-object v10, v9

    goto :goto_4

    :cond_4
    move-object/from16 v10, p7

    :goto_4
    and-int/lit8 v11, v0, 0x20

    if-eqz v11, :cond_5

    const-wide/16 v11, 0x0

    goto :goto_5

    :cond_5
    move-wide/from16 v11, p8

    :goto_5
    and-int/lit8 v13, v0, 0x40

    if-eqz v13, :cond_6

    const/4 v13, 0x0

    goto :goto_6

    :cond_6
    move/from16 v13, p10

    :goto_6
    and-int/lit16 v15, v0, 0x80

    if-eqz v15, :cond_7

    const/4 v15, 0x0

    goto :goto_7

    :cond_7
    move/from16 v15, p11

    :goto_7
    and-int/lit16 v2, v0, 0x100

    if-eqz v2, :cond_8

    const-wide/16 v16, 0x0

    goto :goto_8

    :cond_8
    move-wide/from16 v16, p12

    :goto_8
    and-int/lit16 v2, v0, 0x200

    if-eqz v2, :cond_9

    move-object v2, v9

    goto :goto_9

    :cond_9
    move-object/from16 v2, p14

    :goto_9
    and-int/lit16 v3, v0, 0x400

    if-eqz v3, :cond_a

    const/4 v3, 0x0

    goto :goto_a

    :cond_a
    move/from16 v3, p15

    :goto_a
    and-int/lit16 v14, v0, 0x800

    if-eqz v14, :cond_b

    const/4 v14, 0x0

    goto :goto_b

    :cond_b
    move/from16 v14, p16

    :goto_b
    move-object/from16 p2, v1

    and-int/lit16 v1, v0, 0x1000

    if-eqz v1, :cond_c

    move-object v1, v9

    goto :goto_c

    :cond_c
    move-object/from16 v1, p17

    :goto_c
    move-object/from16 p3, v1

    and-int/lit16 v1, v0, 0x2000

    if-eqz v1, :cond_d

    const/4 v1, 0x0

    goto :goto_d

    :cond_d
    move/from16 v1, p18

    :goto_d
    move/from16 p4, v1

    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_e

    const/4 v1, 0x0

    goto :goto_e

    :cond_e
    move/from16 v1, p19

    :goto_e
    const v18, 0x8000

    and-int v18, v0, v18

    if-eqz v18, :cond_f

    .line 37
    sget v18, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->PROCESS_TYPE_DEFAULT:I

    goto :goto_f

    :cond_f
    move/from16 v18, p20

    :goto_f
    const/high16 v19, 0x10000

    and-int v19, v0, v19

    if-eqz v19, :cond_10

    .line 38
    sget v19, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->PROCESS_STATUS_DEFAULT:I

    goto :goto_10

    :cond_10
    move/from16 v19, p21

    :goto_10
    const/high16 v20, 0x20000

    and-int v20, v0, v20

    if-eqz v20, :cond_11

    move-object/from16 v20, v9

    goto :goto_11

    :cond_11
    move-object/from16 v20, p22

    :goto_11
    const/high16 v21, 0x40000

    and-int v21, v0, v21

    if-eqz v21, :cond_12

    const/16 v21, 0x0

    goto :goto_12

    :cond_12
    move/from16 v21, p23

    :goto_12
    const/high16 v22, 0x80000

    and-int v22, v0, v22

    if-eqz v22, :cond_13

    move-object/from16 v22, v9

    goto :goto_13

    :cond_13
    move-object/from16 v22, p24

    :goto_13
    const/high16 v23, 0x100000

    and-int v23, v0, v23

    if-eqz v23, :cond_14

    move-object/from16 v23, v9

    goto :goto_14

    :cond_14
    move-object/from16 v23, p25

    :goto_14
    const/high16 v24, 0x200000

    and-int v24, v0, v24

    if-eqz v24, :cond_15

    const/16 v24, 0x0

    goto :goto_15

    :cond_15
    move/from16 v24, p26

    :goto_15
    const/high16 v25, 0x400000

    and-int v25, v0, v25

    if-eqz v25, :cond_16

    const/16 v25, 0x0

    goto :goto_16

    :cond_16
    move/from16 v25, p27

    :goto_16
    const/high16 v26, 0x800000

    and-int v26, v0, v26

    if-eqz v26, :cond_17

    const/16 v26, 0x0

    goto :goto_17

    :cond_17
    move/from16 v26, p28

    :goto_17
    const/high16 v27, 0x1000000

    and-int v27, v0, v27

    if-eqz v27, :cond_18

    const/16 v27, 0x0

    goto :goto_18

    :cond_18
    move/from16 v27, p29

    :goto_18
    const/high16 v28, 0x2000000

    and-int v28, v0, v28

    if-eqz v28, :cond_19

    move-object/from16 v28, v9

    goto :goto_19

    :cond_19
    move-object/from16 v28, p30

    :goto_19
    const/high16 v29, 0x4000000

    and-int v29, v0, v29

    if-eqz v29, :cond_1a

    const/16 v29, 0x0

    goto :goto_1a

    :cond_1a
    move/from16 v29, p31

    :goto_1a
    const/high16 v30, 0x8000000

    and-int v30, v0, v30

    if-eqz v30, :cond_1b

    move-object/from16 v30, v9

    goto :goto_1b

    :cond_1b
    move-object/from16 v30, p32

    :goto_1b
    const/high16 v31, 0x10000000

    and-int v31, v0, v31

    if-eqz v31, :cond_1c

    move-object/from16 v31, v9

    goto :goto_1c

    :cond_1c
    move-object/from16 v31, p33

    :goto_1c
    const/high16 v32, 0x20000000

    and-int v32, v0, v32

    if-eqz v32, :cond_1d

    goto :goto_1d

    :cond_1d
    move-object/from16 v9, p34

    :goto_1d
    const/high16 v32, 0x40000000    # 2.0f

    and-int v0, v0, v32

    if-eqz v0, :cond_1e

    const/16 p36, 0x0

    :goto_1e
    move-object/from16 p1, p0

    move-object/from16 p6, p2

    move-object/from16 p18, p3

    move/from16 p19, p4

    move/from16 p20, v1

    move-object/from16 p15, v2

    move/from16 p16, v3

    move-wide/from16 p2, v4

    move-wide/from16 p4, v6

    move-object/from16 p7, v8

    move-object/from16 p35, v9

    move-object/from16 p8, v10

    move-wide/from16 p9, v11

    move/from16 p11, v13

    move/from16 p17, v14

    move/from16 p12, v15

    move-wide/from16 p13, v16

    move/from16 p21, v18

    move/from16 p22, v19

    move-object/from16 p23, v20

    move/from16 p24, v21

    move-object/from16 p25, v22

    move-object/from16 p26, v23

    move/from16 p27, v24

    move/from16 p28, v25

    move/from16 p29, v26

    move/from16 p30, v27

    move-object/from16 p31, v28

    move/from16 p32, v29

    move-object/from16 p33, v30

    move-object/from16 p34, v31

    goto :goto_1f

    :cond_1e
    move/from16 p36, p35

    goto :goto_1e

    .line 39
    :goto_1f
    invoke-direct/range {p1 .. p36}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JIIJLjava/lang/String;IILjava/lang/String;IIIILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;IIIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method public static final synthetic access$getPROCESS_STATUS_COMPLETED$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->PROCESS_STATUS_COMPLETED:I

    return v0
.end method

.method public static final synthetic access$getPROCESS_STATUS_DEFAULT$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->PROCESS_STATUS_DEFAULT:I

    return v0
.end method

.method public static final synthetic access$getPROCESS_STATUS_FAILED$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->PROCESS_STATUS_FAILED:I

    return v0
.end method

.method public static final synthetic access$getPROCESS_STATUS_NOT_PROCESSED$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->PROCESS_STATUS_NOT_PROCESSED:I

    return v0
.end method

.method public static final synthetic access$getPROCESS_STATUS_PENDING$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->PROCESS_STATUS_PENDING:I

    return v0
.end method

.method public static final synthetic access$getPROCESS_STATUS_PROCESSING$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->PROCESS_STATUS_PROCESSING:I

    return v0
.end method

.method public static final synthetic access$getPROCESS_TYPE_DEFAULT$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->PROCESS_TYPE_DEFAULT:I

    return v0
.end method

.method public static final synthetic access$getPROCESS_TYPE_TRANSCODE$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->PROCESS_TYPE_TRANSCODE:I

    return v0
.end method

.method public static final synthetic access$getPROCESS_TYPE_VS_IMAGE$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->PROCESS_TYPE_VS_IMAGE:I

    return v0
.end method

.method public static final synthetic access$getPROCESS_TYPE_VS_JZ$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->PROCESS_TYPE_VS_JZ:I

    return v0
.end method

.method public static final synthetic access$getRESERVED_TYPE_AI_SUMMARY_JSON$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->RESERVED_TYPE_AI_SUMMARY_JSON:I

    return v0
.end method

.method public static final synthetic access$getRESERVED_TYPE_AI_SUMMARY_V3_JSON$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->RESERVED_TYPE_AI_SUMMARY_V3_JSON:I

    return v0
.end method

.method public static final synthetic access$getRESERVED_TYPE_EDIT$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->RESERVED_TYPE_EDIT:I

    return v0
.end method

.method public static final synthetic access$getRESERVED_TYPE_RECORD_USING_APP$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->RESERVED_TYPE_RECORD_USING_APP:I

    return v0
.end method

.method public static final synthetic access$getRESERVED_TYPE_TRANSCRIPTION_JSON$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->RESERVED_TYPE_TRANSCRIPTION_JSON:I

    return v0
.end method

.method public static final synthetic access$getRESERVED_TYPE_TRY_IT_NOW$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->RESERVED_TYPE_TRY_IT_NOW:I

    return v0
.end method

.method public static final synthetic access$getRESERVED_TYPE_USE_RECORDING_CARD$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->RESERVED_TYPE_USE_RECORDING_CARD:I

    return v0
.end method

.method public static final synthetic access$getTYPE_AUDIO$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->TYPE_AUDIO:I

    return v0
.end method

.method public static final synthetic access$getTYPE_AUDIO_FOUR$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->TYPE_AUDIO_FOUR:I

    return v0
.end method

.method public static final synthetic access$getTYPE_AUDIO_ZORE$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->TYPE_AUDIO_ZORE:I

    return v0
.end method

.method public static final synthetic access$getTYPE_GUIDE_DATA$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->TYPE_GUIDE_DATA:I

    return v0
.end method

.method public static final synthetic access$getTYPE_IMAGE$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->TYPE_IMAGE:I

    return v0
.end method

.method public static final synthetic access$getTYPE_UNKNOWN$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->TYPE_UNKNOWN:I

    return v0
.end method

.method public static final synthetic access$getTYPE_VIDEO$cp()I
    .locals 1

    sget v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->TYPE_VIDEO:I

    return v0
.end method

.method public static synthetic copy$default(Lcom/sma/smartv3/db/entity/RecordDeviceFile;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JIIJLjava/lang/String;IILjava/lang/String;IIIILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;IIIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/Object;)Lcom/sma/smartv3/db/entity/RecordDeviceFile;
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p36

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-wide v2, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mId:J

    goto :goto_0

    :cond_0
    move-wide/from16 v2, p1

    :goto_0
    and-int/lit8 v4, v1, 0x2

    if-eqz v4, :cond_1

    iget-wide v4, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mTime:J

    goto :goto_1

    :cond_1
    move-wide/from16 v4, p3

    :goto_1
    and-int/lit8 v6, v1, 0x4

    if-eqz v6, :cond_2

    iget-object v6, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mLocalTime:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v6, p5

    :goto_2
    and-int/lit8 v7, v1, 0x8

    if-eqz v7, :cond_3

    iget-object v7, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mName:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v7, p6

    :goto_3
    and-int/lit8 v8, v1, 0x10

    if-eqz v8, :cond_4

    iget-object v8, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mPath:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v8, p7

    :goto_4
    and-int/lit8 v9, v1, 0x20

    if-eqz v9, :cond_5

    iget-wide v9, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mSize:J

    goto :goto_5

    :cond_5
    move-wide/from16 v9, p8

    :goto_5
    and-int/lit8 v11, v1, 0x40

    if-eqz v11, :cond_6

    iget v11, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mWidth:I

    goto :goto_6

    :cond_6
    move/from16 v11, p10

    :goto_6
    and-int/lit16 v12, v1, 0x80

    if-eqz v12, :cond_7

    iget v12, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mHeight:I

    goto :goto_7

    :cond_7
    move/from16 v12, p11

    :goto_7
    and-int/lit16 v13, v1, 0x100

    if-eqz v13, :cond_8

    iget-wide v13, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mDuration:J

    goto :goto_8

    :cond_8
    move-wide/from16 v13, p12

    :goto_8
    and-int/lit16 v15, v1, 0x200

    if-eqz v15, :cond_9

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mThumbnail:Ljava/lang/String;

    goto :goto_9

    :cond_9
    move-object/from16 v15, p14

    :goto_9
    move-wide/from16 v16, v2

    and-int/lit16 v2, v1, 0x400

    if-eqz v2, :cond_a

    iget v2, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mFileType:I

    goto :goto_a

    :cond_a
    move/from16 v2, p15

    :goto_a
    and-int/lit16 v3, v1, 0x800

    if-eqz v3, :cond_b

    iget v3, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsFavority:I

    goto :goto_b

    :cond_b
    move/from16 v3, p16

    :goto_b
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x1000

    if-eqz v2, :cond_c

    iget-object v2, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mContent:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v2, p17

    :goto_c
    move-object/from16 p2, v2

    and-int/lit16 v2, v1, 0x2000

    if-eqz v2, :cond_d

    iget v2, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsSync:I

    goto :goto_d

    :cond_d
    move/from16 v2, p18

    :goto_d
    move/from16 p3, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget v2, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsDelete:I

    goto :goto_e

    :cond_e
    move/from16 v2, p19

    :goto_e
    const v18, 0x8000

    and-int v18, v1, v18

    if-eqz v18, :cond_f

    iget v1, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mProcessType:I

    goto :goto_f

    :cond_f
    move/from16 v1, p20

    :goto_f
    const/high16 v18, 0x10000

    and-int v18, p36, v18

    move/from16 p4, v1

    if-eqz v18, :cond_10

    iget v1, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mProcessStatus:I

    goto :goto_10

    :cond_10
    move/from16 v1, p21

    :goto_10
    const/high16 v18, 0x20000

    and-int v18, p36, v18

    move/from16 p5, v1

    if-eqz v18, :cond_11

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mProcessPath:Ljava/lang/String;

    goto :goto_11

    :cond_11
    move-object/from16 v1, p22

    :goto_11
    const/high16 v18, 0x40000

    and-int v18, p36, v18

    move-object/from16 p6, v1

    if-eqz v18, :cond_12

    iget-boolean v1, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->isSelected:Z

    goto :goto_12

    :cond_12
    move/from16 v1, p23

    :goto_12
    const/high16 v18, 0x80000

    and-int v18, p36, v18

    move/from16 p7, v1

    if-eqz v18, :cond_13

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mUrl:Ljava/lang/String;

    goto :goto_13

    :cond_13
    move-object/from16 v1, p24

    :goto_13
    const/high16 v18, 0x100000

    and-int v18, p36, v18

    move-object/from16 p8, v1

    if-eqz v18, :cond_14

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mRemotePath:Ljava/lang/String;

    goto :goto_14

    :cond_14
    move-object/from16 v1, p25

    :goto_14
    const/high16 v18, 0x200000

    and-int v18, p36, v18

    move-object/from16 p9, v1

    if-eqz v18, :cond_15

    iget v1, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mPosition:I

    goto :goto_15

    :cond_15
    move/from16 v1, p26

    :goto_15
    const/high16 v18, 0x400000

    and-int v18, p36, v18

    move/from16 p10, v1

    if-eqz v18, :cond_16

    iget v1, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsRead:I

    goto :goto_16

    :cond_16
    move/from16 v1, p27

    :goto_16
    const/high16 v18, 0x800000

    and-int v18, p36, v18

    move/from16 p11, v1

    if-eqz v18, :cond_17

    iget v1, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsConversion:I

    goto :goto_17

    :cond_17
    move/from16 v1, p28

    :goto_17
    const/high16 v18, 0x1000000

    and-int v18, p36, v18

    move/from16 p12, v1

    if-eqz v18, :cond_18

    iget v1, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mReservedTextType:I

    goto :goto_18

    :cond_18
    move/from16 v1, p29

    :goto_18
    const/high16 v18, 0x2000000

    and-int v18, p36, v18

    move/from16 p13, v1

    if-eqz v18, :cond_19

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mReservedText:Ljava/lang/String;

    goto :goto_19

    :cond_19
    move-object/from16 v1, p30

    :goto_19
    const/high16 v18, 0x4000000

    and-int v18, p36, v18

    move-object/from16 p14, v1

    if-eqz v18, :cond_1a

    iget v1, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsSummaryReport:I

    goto :goto_1a

    :cond_1a
    move/from16 v1, p31

    :goto_1a
    const/high16 v18, 0x8000000

    and-int v18, p36, v18

    move/from16 p15, v1

    if-eqz v18, :cond_1b

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mSummaryReportText:Ljava/lang/String;

    goto :goto_1b

    :cond_1b
    move-object/from16 v1, p32

    :goto_1b
    const/high16 v18, 0x10000000

    and-int v18, p36, v18

    move-object/from16 p16, v1

    if-eqz v18, :cond_1c

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mFileName:Ljava/lang/String;

    goto :goto_1c

    :cond_1c
    move-object/from16 v1, p33

    :goto_1c
    const/high16 v18, 0x20000000

    and-int v18, p36, v18

    move-object/from16 p17, v1

    if-eqz v18, :cond_1d

    iget-object v1, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mTaskId:Ljava/lang/String;

    goto :goto_1d

    :cond_1d
    move-object/from16 v1, p34

    :goto_1d
    const/high16 v18, 0x40000000    # 2.0f

    and-int v18, p36, v18

    if-eqz v18, :cond_1e

    move-object/from16 p18, v1

    iget v1, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mModel:I

    move-object/from16 p35, p18

    move/from16 p36, v1

    move/from16 p19, p3

    move/from16 p21, p4

    move/from16 p22, p5

    move-object/from16 p23, p6

    move/from16 p24, p7

    move-object/from16 p25, p8

    move-object/from16 p26, p9

    move/from16 p27, p10

    move/from16 p28, p11

    move/from16 p29, p12

    move/from16 p30, p13

    move-object/from16 p31, p14

    move/from16 p32, p15

    move-object/from16 p33, p16

    move-object/from16 p34, p17

    move/from16 p20, v2

    move/from16 p17, v3

    move-wide/from16 p4, v4

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-wide/from16 p9, v9

    move/from16 p11, v11

    move/from16 p12, v12

    move-wide/from16 p13, v13

    move-object/from16 p15, v15

    move/from16 p16, p1

    move-object/from16 p18, p2

    move-object/from16 p1, v0

    move-wide/from16 p2, v16

    goto :goto_1e

    :cond_1e
    move/from16 p36, p35

    move-object/from16 p35, v1

    move-object/from16 p18, p2

    move/from16 p19, p3

    move/from16 p21, p4

    move/from16 p22, p5

    move-object/from16 p23, p6

    move/from16 p24, p7

    move-object/from16 p25, p8

    move-object/from16 p26, p9

    move/from16 p27, p10

    move/from16 p28, p11

    move/from16 p29, p12

    move/from16 p30, p13

    move-object/from16 p31, p14

    move/from16 p32, p15

    move-object/from16 p33, p16

    move-object/from16 p34, p17

    move/from16 p20, v2

    move/from16 p17, v3

    move-wide/from16 p4, v4

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-wide/from16 p9, v9

    move/from16 p11, v11

    move/from16 p12, v12

    move-wide/from16 p13, v13

    move-object/from16 p15, v15

    move-wide/from16 p2, v16

    move/from16 p16, p1

    move-object/from16 p1, v0

    :goto_1e
    invoke-virtual/range {p1 .. p36}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->copy(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JIIJLjava/lang/String;IILjava/lang/String;IIIILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;IIIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/sma/smartv3/db/entity/RecordDeviceFile;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mId:J

    return-wide v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mThumbnail:Ljava/lang/String;

    return-object v0
.end method

.method public final component11()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mFileType:I

    return v0
.end method

.method public final component12()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsFavority:I

    return v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mContent:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsSync:I

    return v0
.end method

.method public final component15()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsDelete:I

    return v0
.end method

.method public final component16()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mProcessType:I

    return v0
.end method

.method public final component17()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mProcessStatus:I

    return v0
.end method

.method public final component18()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mProcessPath:Ljava/lang/String;

    return-object v0
.end method

.method public final component19()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->isSelected:Z

    return v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mTime:J

    return-wide v0
.end method

.method public final component20()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component21()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mRemotePath:Ljava/lang/String;

    return-object v0
.end method

.method public final component22()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mPosition:I

    return v0
.end method

.method public final component23()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsRead:I

    return v0
.end method

.method public final component24()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsConversion:I

    return v0
.end method

.method public final component25()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mReservedTextType:I

    return v0
.end method

.method public final component26()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mReservedText:Ljava/lang/String;

    return-object v0
.end method

.method public final component27()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsSummaryReport:I

    return v0
.end method

.method public final component28()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mSummaryReportText:Ljava/lang/String;

    return-object v0
.end method

.method public final component29()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mFileName:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mLocalTime:Ljava/lang/String;

    return-object v0
.end method

.method public final component30()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mTaskId:Ljava/lang/String;

    return-object v0
.end method

.method public final component31()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mModel:I

    return v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mName:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mPath:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mSize:J

    return-wide v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mWidth:I

    return v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mHeight:I

    return v0
.end method

.method public final component9()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mDuration:J

    return-wide v0
.end method

.method public final copy(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JIIJLjava/lang/String;IILjava/lang/String;IIIILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;IIIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/sma/smartv3/db/entity/RecordDeviceFile;
    .locals 37
    .param p5    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p6    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p14    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p17    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p22    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p24    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p25    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p30    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p32    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p33    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p34    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mLocalTime"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mName"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mPath"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mThumbnail"

    move-object/from16 v15, p14

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mContent"

    move-object/from16 v1, p17

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mProcessPath"

    move-object/from16 v2, p22

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mUrl"

    move-object/from16 v3, p24

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mRemotePath"

    move-object/from16 v4, p25

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mReservedText"

    move-object/from16 v5, p30

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mSummaryReportText"

    move-object/from16 v9, p32

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mFileName"

    move-object/from16 v10, p33

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mTaskId"

    move-object/from16 v11, p34

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;

    move/from16 v12, p11

    move-wide/from16 v13, p12

    move/from16 v16, p15

    move/from16 v17, p16

    move-object/from16 v18, p17

    move/from16 v19, p18

    move/from16 v20, p19

    move/from16 v21, p20

    move/from16 v22, p21

    move/from16 v24, p23

    move/from16 v27, p26

    move/from16 v28, p27

    move/from16 v29, p28

    move/from16 v30, p29

    move/from16 v32, p31

    move/from16 v36, p35

    move-object/from16 v23, v2

    move-object/from16 v25, v3

    move-object/from16 v26, v4

    move-object/from16 v31, v5

    move-object/from16 v33, v9

    move-object/from16 v34, v10

    move-object/from16 v35, v11

    move-wide/from16 v2, p1

    move-wide/from16 v4, p3

    move-wide/from16 v9, p8

    move/from16 v11, p10

    invoke-direct/range {v1 .. v36}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JIIJLjava/lang/String;IILjava/lang/String;IIIILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;IIIILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;

    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mId:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mId:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mTime:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mLocalTime:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mLocalTime:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mName:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mPath:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mPath:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mSize:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mSize:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mWidth:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mWidth:I

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mHeight:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mHeight:I

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-wide v3, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mDuration:J

    iget-wide v5, p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mDuration:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mThumbnail:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mThumbnail:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mFileType:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mFileType:I

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsFavority:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsFavority:I

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mContent:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mContent:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsSync:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsSync:I

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsDelete:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsDelete:I

    if-eq v1, v3, :cond_10

    return v2

    :cond_10
    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mProcessType:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mProcessType:I

    if-eq v1, v3, :cond_11

    return v2

    :cond_11
    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mProcessStatus:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mProcessStatus:I

    if-eq v1, v3, :cond_12

    return v2

    :cond_12
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mProcessPath:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mProcessPath:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    return v2

    :cond_13
    iget-boolean v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->isSelected:Z

    iget-boolean v3, p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->isSelected:Z

    if-eq v1, v3, :cond_14

    return v2

    :cond_14
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    return v2

    :cond_15
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mRemotePath:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mRemotePath:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    return v2

    :cond_16
    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mPosition:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mPosition:I

    if-eq v1, v3, :cond_17

    return v2

    :cond_17
    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsRead:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsRead:I

    if-eq v1, v3, :cond_18

    return v2

    :cond_18
    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsConversion:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsConversion:I

    if-eq v1, v3, :cond_19

    return v2

    :cond_19
    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mReservedTextType:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mReservedTextType:I

    if-eq v1, v3, :cond_1a

    return v2

    :cond_1a
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mReservedText:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mReservedText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    return v2

    :cond_1b
    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsSummaryReport:I

    iget v3, p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsSummaryReport:I

    if-eq v1, v3, :cond_1c

    return v2

    :cond_1c
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mSummaryReportText:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mSummaryReportText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    return v2

    :cond_1d
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mFileName:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mFileName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    return v2

    :cond_1e
    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mTaskId:Ljava/lang/String;

    iget-object v3, p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mTaskId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    return v2

    :cond_1f
    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mModel:I

    iget p1, p1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mModel:I

    if-eq v1, p1, :cond_20

    return v2

    :cond_20
    return v0
.end method

.method public final getMContent()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mContent:Ljava/lang/String;

    return-object v0
.end method

.method public final getMDuration()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mDuration:J

    return-wide v0
.end method

.method public final getMFileName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mFileName:Ljava/lang/String;

    return-object v0
.end method

.method public final getMFileType()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mFileType:I

    return v0
.end method

.method public final getMHeight()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mHeight:I

    return v0
.end method

.method public final getMId()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mId:J

    return-wide v0
.end method

.method public final getMIsConversion()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsConversion:I

    return v0
.end method

.method public final getMIsDelete()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsDelete:I

    return v0
.end method

.method public final getMIsFavority()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsFavority:I

    return v0
.end method

.method public final getMIsRead()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsRead:I

    return v0
.end method

.method public final getMIsSummaryReport()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsSummaryReport:I

    return v0
.end method

.method public final getMIsSync()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsSync:I

    return v0
.end method

.method public final getMLocalTime()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mLocalTime:Ljava/lang/String;

    return-object v0
.end method

.method public final getMModel()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mModel:I

    return v0
.end method

.method public final getMName()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mName:Ljava/lang/String;

    return-object v0
.end method

.method public final getMPath()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mPath:Ljava/lang/String;

    return-object v0
.end method

.method public final getMPosition()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mPosition:I

    return v0
.end method

.method public final getMProcessPath()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mProcessPath:Ljava/lang/String;

    return-object v0
.end method

.method public final getMProcessStatus()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mProcessStatus:I

    return v0
.end method

.method public final getMProcessType()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mProcessType:I

    return v0
.end method

.method public final getMRemotePath()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mRemotePath:Ljava/lang/String;

    return-object v0
.end method

.method public final getMReservedText()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mReservedText:Ljava/lang/String;

    return-object v0
.end method

.method public final getMReservedTextType()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mReservedTextType:I

    return v0
.end method

.method public final getMSize()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mSize:J

    return-wide v0
.end method

.method public final getMSummaryReportText()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mSummaryReportText:Ljava/lang/String;

    return-object v0
.end method

.method public final getMTaskId()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mTaskId:Ljava/lang/String;

    return-object v0
.end method

.method public final getMThumbnail()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mThumbnail:Ljava/lang/String;

    return-object v0
.end method

.method public final getMTime()J
    .locals 2

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mTime:J

    return-wide v0
.end method

.method public final getMUrl()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getMWidth()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mWidth:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-wide v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mId:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mTime:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mLocalTime:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mPath:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mSize:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mWidth:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mHeight:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mDuration:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mThumbnail:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mFileType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsFavority:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mContent:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsSync:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsDelete:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mProcessType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mProcessStatus:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mProcessPath:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->isSelected:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mUrl:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mRemotePath:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mPosition:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsRead:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsConversion:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mReservedTextType:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mReservedText:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsSummaryReport:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mSummaryReportText:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mFileName:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mTaskId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mModel:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isProcessingStatus()Z
    .locals 2

    iget v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mProcessStatus:I

    sget v1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->PROCESS_STATUS_PENDING:I

    if-eq v0, v1, :cond_1

    sget v1, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->PROCESS_STATUS_PROCESSING:I

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method public final isSelected()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->isSelected:Z

    return v0
.end method

.method public final setMContent(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mContent:Ljava/lang/String;

    return-void
.end method

.method public final setMDuration(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mDuration:J

    return-void
.end method

.method public final setMFileName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mFileName:Ljava/lang/String;

    return-void
.end method

.method public final setMFileType(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mFileType:I

    return-void
.end method

.method public final setMHeight(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mHeight:I

    return-void
.end method

.method public final setMId(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mId:J

    return-void
.end method

.method public final setMIsConversion(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsConversion:I

    return-void
.end method

.method public final setMIsDelete(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsDelete:I

    return-void
.end method

.method public final setMIsFavority(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsFavority:I

    return-void
.end method

.method public final setMIsRead(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsRead:I

    return-void
.end method

.method public final setMIsSummaryReport(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsSummaryReport:I

    return-void
.end method

.method public final setMIsSync(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsSync:I

    return-void
.end method

.method public final setMLocalTime(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mLocalTime:Ljava/lang/String;

    return-void
.end method

.method public final setMModel(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mModel:I

    return-void
.end method

.method public final setMName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mName:Ljava/lang/String;

    return-void
.end method

.method public final setMPath(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mPath:Ljava/lang/String;

    return-void
.end method

.method public final setMPosition(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mPosition:I

    return-void
.end method

.method public final setMProcessPath(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mProcessPath:Ljava/lang/String;

    return-void
.end method

.method public final setMProcessStatus(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mProcessStatus:I

    return-void
.end method

.method public final setMProcessType(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mProcessType:I

    return-void
.end method

.method public final setMRemotePath(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mRemotePath:Ljava/lang/String;

    return-void
.end method

.method public final setMReservedText(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mReservedText:Ljava/lang/String;

    return-void
.end method

.method public final setMReservedTextType(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mReservedTextType:I

    return-void
.end method

.method public final setMSize(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mSize:J

    return-void
.end method

.method public final setMSummaryReportText(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mSummaryReportText:Ljava/lang/String;

    return-void
.end method

.method public final setMTaskId(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mTaskId:Ljava/lang/String;

    return-void
.end method

.method public final setMThumbnail(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mThumbnail:Ljava/lang/String;

    return-void
.end method

.method public final setMTime(J)V
    .locals 0

    iput-wide p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mTime:J

    return-void
.end method

.method public final setMUrl(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mUrl:Ljava/lang/String;

    return-void
.end method

.method public final setMWidth(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mWidth:I

    return-void
.end method

.method public final setSelected(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->isSelected:Z

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 37
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    move-object/from16 v0, p0

    iget-wide v1, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mId:J

    iget-wide v3, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mTime:J

    iget-object v5, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mLocalTime:Ljava/lang/String;

    iget-object v6, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mName:Ljava/lang/String;

    iget-object v7, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mPath:Ljava/lang/String;

    iget-wide v8, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mSize:J

    iget v10, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mWidth:I

    iget v11, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mHeight:I

    iget-wide v12, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mDuration:J

    iget-object v14, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mThumbnail:Ljava/lang/String;

    iget v15, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mFileType:I

    move/from16 v16, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsFavority:I

    move/from16 v17, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mContent:Ljava/lang/String;

    move-object/from16 v18, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsSync:I

    move/from16 v19, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsDelete:I

    move/from16 v20, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mProcessType:I

    move/from16 v21, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mProcessStatus:I

    move/from16 v22, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mProcessPath:Ljava/lang/String;

    move-object/from16 v23, v15

    iget-boolean v15, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->isSelected:Z

    move/from16 v24, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mUrl:Ljava/lang/String;

    move-object/from16 v25, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mRemotePath:Ljava/lang/String;

    move-object/from16 v26, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mPosition:I

    move/from16 v27, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsRead:I

    move/from16 v28, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsConversion:I

    move/from16 v29, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mReservedTextType:I

    move/from16 v30, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mReservedText:Ljava/lang/String;

    move-object/from16 v31, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mIsSummaryReport:I

    move/from16 v32, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mSummaryReportText:Ljava/lang/String;

    move-object/from16 v33, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mFileName:Ljava/lang/String;

    move-object/from16 v34, v15

    iget-object v15, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mTaskId:Ljava/lang/String;

    move-object/from16 v35, v15

    iget v15, v0, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->mModel:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move/from16 v36, v15

    const-string v15, "RecordDeviceFile(mId="

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mLocalTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mPath="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mSize="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mWidth="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mHeight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12, v13}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", mThumbnail="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mFileType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mIsFavority="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mContent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mIsSync="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mIsDelete="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v20

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mProcessType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v21

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mProcessStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v22

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mProcessPath="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v23

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", isSelected="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v24

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", mUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v25

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mRemotePath="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mPosition="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v27

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mIsRead="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v28

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mIsConversion="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mReservedTextType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v30

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mReservedText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v31

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mIsSummaryReport="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v32

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mSummaryReportText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v33

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mFileName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v34

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mTaskId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v35

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mModel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v36

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
