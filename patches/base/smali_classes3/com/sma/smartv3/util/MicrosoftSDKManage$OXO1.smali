.class public final Lcom/sma/smartv3/util/MicrosoftSDKManage$OXO1;
.super Lcom/microsoft/cognitiveservices/speech/audio/PullAudioInputStreamCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/util/MicrosoftSDKManage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "OXO1"
.end annotation


# instance fields
.field public OXO1:Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/microsoft/cognitiveservices/speech/audio/PullAudioInputStreamCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final OXO1(Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$OXO1;->OXO1:Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;

    return-void
.end method

.method public close()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$OXO1;->OXO1:Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->OXO1()V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$OXO1;->OXO1:Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;

    sget-object v1, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v1}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lcom/sma/smartv3/biz/voice/RecordingManager;->setRecording(Z)V

    sget-object v1, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->Ii1iii0()Landroid/media/AudioRecord;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Landroid/media/AudioRecord;->stop()V

    invoke-virtual {v2}, Landroid/media/AudioRecord;->release()V

    invoke-virtual {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->X0iO(Landroid/media/AudioRecord;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "MicrosoftSDKManage close e = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public read([B)I
    .locals 9
    .param p1    # [B
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object v0, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->X00XIX1()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->Ii1iii0()Landroid/media/AudioRecord;

    move-result-object v1

    if-eqz v1, :cond_3

    if-eqz p1, :cond_3

    :try_start_0
    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v1

    monitor-enter v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->Ii1iii0()Landroid/media/AudioRecord;

    move-result-object v0

    if-eqz v0, :cond_0

    array-length v3, p1

    invoke-virtual {v0, p1, v2, v3}, Landroid/media/AudioRecord;->read([BII)I

    move-result v0

    int-to-long v3, v0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_1

    :cond_0
    const-wide/16 v3, 0x0

    :goto_0
    sget-object v0, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/VoiceManager;->getMPcmFile()Ljava/io/File;

    move-result-object v0

    const/4 v5, 0x1

    invoke-static {v0, p1, v5}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromBytesByStream(Ljava/io/File;[BZ)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    long-to-int p1, v3

    :try_start_2
    monitor-exit v1

    return p1

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :goto_1
    monitor-exit v1

    throw p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :goto_2
    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    goto :goto_3

    :cond_1
    if-eqz p1, :cond_3

    iget-object v3, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$OXO1;->OXO1:Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;

    if-eqz v3, :cond_3

    if-nez v3, :cond_2

    return v2

    :cond_2
    array-length v6, p1

    const-wide/16 v7, 0x96

    const/4 v5, 0x0

    move-object v4, p1

    invoke-virtual/range {v3 .. v8}, Lcom/sma/smartv3/util/MicrosoftSDKManage$O00;->iO([BIIJ)I

    move-result p1

    return p1

    :cond_3
    :goto_3
    return v2
.end method
