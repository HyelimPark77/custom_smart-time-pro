.class public final Lcom/sma/smartv3/db/entity/RecordDeviceFile$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/db/entity/RecordDeviceFile;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final getFileType(Ljava/lang/String;)I
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lcom/blankj/utilcode/util/FileUtils;->getFileExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "getFileExtension(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "toLowerCase(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "webp"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "opus"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_0

    :sswitch_2
    const-string v0, "jpeg"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_0

    :sswitch_3
    const-string v0, "JPEG"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto/16 :goto_0

    :sswitch_4
    const-string v0, "wav"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :sswitch_5
    const-string v0, "pcm"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :sswitch_6
    const-string v0, "mov"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :sswitch_7
    const-string v0, "mp4"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :sswitch_8
    const-string v0, "mp3"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :sswitch_9
    const-string v0, "jpg"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :sswitch_a
    const-string v0, "avi"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :sswitch_b
    const-string v0, "aac"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile$Companion;->getTYPE_AUDIO()I

    move-result p1

    return p1

    :sswitch_c
    const-string v0, "MOV"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile$Companion;->getTYPE_VIDEO()I

    move-result p1

    return p1

    :sswitch_d
    const-string v0, "JPG"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    :goto_0
    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile$Companion;->getTYPE_UNKNOWN()I

    move-result p1

    return p1

    :cond_2
    invoke-virtual {p0}, Lcom/sma/smartv3/db/entity/RecordDeviceFile$Companion;->getTYPE_IMAGE()I

    move-result p1

    return p1

    nop

    :sswitch_data_0
    .sparse-switch
        0x11fc1 -> :sswitch_d
        0x12af4 -> :sswitch_c
        0x17843 -> :sswitch_b
        0x17ad4 -> :sswitch_a
        0x19be1 -> :sswitch_9
        0x1a6f0 -> :sswitch_8
        0x1a6f1 -> :sswitch_7
        0x1a714 -> :sswitch_6
        0x1b0da -> :sswitch_5
        0x1caec -> :sswitch_4
        0x22d868 -> :sswitch_3
        0x31e068 -> :sswitch_2
        0x34283f -> :sswitch_1
        0x379f9c -> :sswitch_0
    .end sparse-switch
.end method

.method public final getPROCESS_STATUS_COMPLETED()I
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->access$getPROCESS_STATUS_COMPLETED$cp()I

    move-result v0

    return v0
.end method

.method public final getPROCESS_STATUS_DEFAULT()I
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->access$getPROCESS_STATUS_DEFAULT$cp()I

    move-result v0

    return v0
.end method

.method public final getPROCESS_STATUS_FAILED()I
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->access$getPROCESS_STATUS_FAILED$cp()I

    move-result v0

    return v0
.end method

.method public final getPROCESS_STATUS_NOT_PROCESSED()I
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->access$getPROCESS_STATUS_NOT_PROCESSED$cp()I

    move-result v0

    return v0
.end method

.method public final getPROCESS_STATUS_PENDING()I
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->access$getPROCESS_STATUS_PENDING$cp()I

    move-result v0

    return v0
.end method

.method public final getPROCESS_STATUS_PROCESSING()I
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->access$getPROCESS_STATUS_PROCESSING$cp()I

    move-result v0

    return v0
.end method

.method public final getPROCESS_TYPE_DEFAULT()I
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->access$getPROCESS_TYPE_DEFAULT$cp()I

    move-result v0

    return v0
.end method

.method public final getPROCESS_TYPE_TRANSCODE()I
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->access$getPROCESS_TYPE_TRANSCODE$cp()I

    move-result v0

    return v0
.end method

.method public final getPROCESS_TYPE_VS_IMAGE()I
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->access$getPROCESS_TYPE_VS_IMAGE$cp()I

    move-result v0

    return v0
.end method

.method public final getPROCESS_TYPE_VS_JZ()I
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->access$getPROCESS_TYPE_VS_JZ$cp()I

    move-result v0

    return v0
.end method

.method public final getRESERVED_TYPE_AI_SUMMARY_JSON()I
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->access$getRESERVED_TYPE_AI_SUMMARY_JSON$cp()I

    move-result v0

    return v0
.end method

.method public final getRESERVED_TYPE_AI_SUMMARY_V3_JSON()I
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->access$getRESERVED_TYPE_AI_SUMMARY_V3_JSON$cp()I

    move-result v0

    return v0
.end method

.method public final getRESERVED_TYPE_EDIT()I
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->access$getRESERVED_TYPE_EDIT$cp()I

    move-result v0

    return v0
.end method

.method public final getRESERVED_TYPE_RECORD_USING_APP()I
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->access$getRESERVED_TYPE_RECORD_USING_APP$cp()I

    move-result v0

    return v0
.end method

.method public final getRESERVED_TYPE_TRANSCRIPTION_JSON()I
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->access$getRESERVED_TYPE_TRANSCRIPTION_JSON$cp()I

    move-result v0

    return v0
.end method

.method public final getRESERVED_TYPE_TRY_IT_NOW()I
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->access$getRESERVED_TYPE_TRY_IT_NOW$cp()I

    move-result v0

    return v0
.end method

.method public final getRESERVED_TYPE_USE_RECORDING_CARD()I
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->access$getRESERVED_TYPE_USE_RECORDING_CARD$cp()I

    move-result v0

    return v0
.end method

.method public final getTYPE_AUDIO()I
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->access$getTYPE_AUDIO$cp()I

    move-result v0

    return v0
.end method

.method public final getTYPE_AUDIO_FOUR()I
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->access$getTYPE_AUDIO_FOUR$cp()I

    move-result v0

    return v0
.end method

.method public final getTYPE_AUDIO_ZORE()I
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->access$getTYPE_AUDIO_ZORE$cp()I

    move-result v0

    return v0
.end method

.method public final getTYPE_GUIDE_DATA()I
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->access$getTYPE_GUIDE_DATA$cp()I

    move-result v0

    return v0
.end method

.method public final getTYPE_IMAGE()I
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->access$getTYPE_IMAGE$cp()I

    move-result v0

    return v0
.end method

.method public final getTYPE_UNKNOWN()I
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->access$getTYPE_UNKNOWN$cp()I

    move-result v0

    return v0
.end method

.method public final getTYPE_VIDEO()I
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/db/entity/RecordDeviceFile;->access$getTYPE_VIDEO$cp()I

    move-result v0

    return v0
.end method
