.class public final Lcom/sma/smartv3/util/MicrosoftSDKManage$XOO0ii0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/sma/smartv3/util/MicrosoftSDKManage;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "XOO0ii0"
.end annotation


# instance fields
.field public I1:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field public IO:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public X11iII1O1:I

.field public iX1O1:Lcom/sma/smartv3/model/LeftAndRightPlayControl;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$XOO0ii0;->I1:Ljava/lang/String;

    sget-object v0, Lcom/sma/smartv3/model/LeftAndRightPlayControl;->LEFT_AND_RIGHT:Lcom/sma/smartv3/model/LeftAndRightPlayControl;

    iput-object v0, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$XOO0ii0;->iX1O1:Lcom/sma/smartv3/model/LeftAndRightPlayControl;

    const/4 v0, -0x1

    iput v0, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$XOO0ii0;->X11iII1O1:I

    return-void
.end method


# virtual methods
.method public final O00(Lcom/sma/smartv3/model/LeftAndRightPlayControl;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/model/LeftAndRightPlayControl;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "leftOrRight"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$XOO0ii0;->iX1O1:Lcom/sma/smartv3/model/LeftAndRightPlayControl;

    return-void
.end method

.method public final OXO1(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$XOO0ii0;->X11iII1O1:I

    return-void
.end method

.method public final XIi00iiXO(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "ttsName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$XOO0ii0;->I1:Ljava/lang/String;

    return-void
.end method

.method public final XO0O10(Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$XOO0ii0;->IO:Ljava/lang/String;

    return-void
.end method

.method public final iO(I)V
    .locals 10

    invoke-static {}, Lcom/blankj/utilcode/util/Utils;->getApp()Landroid/app/Application;

    move-result-object v0

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.media.AudioManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/media/AudioManager;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->getDevices(I)[Landroid/media/AudioDeviceInfo;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    array-length v2, v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, v3

    move-object v6, v5

    :goto_0
    const/16 v7, 0x8

    if-ge v4, v2, :cond_2

    aget-object v8, v0, v4

    invoke-virtual {v8}, Landroid/media/AudioDeviceInfo;->getType()I

    move-result v9

    if-ne v9, v7, :cond_0

    move-object v6, v8

    goto :goto_1

    :cond_0
    invoke-virtual {v8}, Landroid/media/AudioDeviceInfo;->getType()I

    move-result v7

    if-ne v7, v1, :cond_1

    move-object v5, v8

    :cond_1
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_2
    if-eq p1, v1, :cond_5

    if-eq p1, v7, :cond_3

    sget-object p1, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {p1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object p1

    invoke-static {p1}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->XiOIii1(Lcom/sma/smartv3/util/MicrosoftSDKManage;)Landroid/media/AudioTrack;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1, v3}, Landroid/media/AudioTrack;->setPreferredDevice(Landroid/media/AudioDeviceInfo;)Z

    return-void

    :cond_3
    if-eqz v6, :cond_4

    sget-object p1, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {p1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object p1

    invoke-static {p1}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->XiOIii1(Lcom/sma/smartv3/util/MicrosoftSDKManage;)Landroid/media/AudioTrack;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1, v6}, Landroid/media/AudioTrack;->setPreferredDevice(Landroid/media/AudioDeviceInfo;)Z

    return-void

    :cond_4
    sget-object p1, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {p1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object p1

    invoke-static {p1}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->XiOIii1(Lcom/sma/smartv3/util/MicrosoftSDKManage;)Landroid/media/AudioTrack;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1, v3}, Landroid/media/AudioTrack;->setPreferredDevice(Landroid/media/AudioDeviceInfo;)Z

    return-void

    :cond_5
    if-eqz v5, :cond_6

    sget-object p1, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {p1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object p1

    invoke-static {p1}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->XiOIii1(Lcom/sma/smartv3/util/MicrosoftSDKManage;)Landroid/media/AudioTrack;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1, v5}, Landroid/media/AudioTrack;->setPreferredDevice(Landroid/media/AudioDeviceInfo;)Z

    return-void

    :cond_6
    sget-object p1, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {p1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object p1

    invoke-static {p1}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->XiOIii1(Lcom/sma/smartv3/util/MicrosoftSDKManage;)Landroid/media/AudioTrack;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1, v3}, Landroid/media/AudioTrack;->setPreferredDevice(Landroid/media/AudioDeviceInfo;)Z

    :cond_7
    return-void
.end method

.method public run()V
    .locals 14

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v1, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v2

    invoke-static {v2}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->i010I(Lcom/sma/smartv3/util/MicrosoftSDKManage;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$XOO0ii0;->IO:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " run content = "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :try_start_0
    sget-object v2, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v2}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->getMTtsFilePcm()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    iget v2, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$XOO0ii0;->X11iII1O1:I

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XOO0ii0;->iO(I)V

    invoke-virtual {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v2

    invoke-static {v2}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->XiOIii1(Lcom/sma/smartv3/util/MicrosoftSDKManage;)Landroid/media/AudioTrack;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/media/AudioTrack;->play()V

    goto :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_b

    :cond_0
    :goto_0
    invoke-virtual {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v2

    invoke-static {v2}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->X01IiOiIi(Lcom/sma/smartv3/util/MicrosoftSDKManage;)Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    invoke-virtual {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->iOO1ii1(Lcom/sma/smartv3/util/MicrosoftSDKManage;Z)V

    sget-object v3, Lkotlin/Unit;->OXO1:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v2

    invoke-virtual {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v2

    invoke-static {v2}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->II1Xi0(Lcom/sma/smartv3/util/MicrosoftSDKManage;)Lcom/microsoft/cognitiveservices/speech/SpeechSynthesizer;

    move-result-object v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v1

    invoke-static {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->i010I(Lcom/sma/smartv3/util/MicrosoftSDKManage;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " synthesizer = null."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-virtual {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v2

    invoke-static {v2}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->OX(Lcom/sma/smartv3/util/MicrosoftSDKManage;)Z

    move-result v2

    if-nez v2, :cond_2

    goto/16 :goto_c

    :cond_2
    iget-object v2, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$XOO0ii0;->I1:Ljava/lang/String;

    invoke-virtual {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v3

    invoke-virtual {v3}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->iXiiiO()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_5

    invoke-virtual {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v2

    invoke-static {v2}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->I1(Lcom/sma/smartv3/util/MicrosoftSDKManage;)Lcom/microsoft/cognitiveservices/speech/SpeechConfig;

    move-result-object v2

    if-eqz v2, :cond_3

    sget-object v5, Lcom/microsoft/cognitiveservices/speech/SpeechSynthesisOutputFormat;->Raw24Khz16BitMonoPcm:Lcom/microsoft/cognitiveservices/speech/SpeechSynthesisOutputFormat;

    invoke-virtual {v2, v5}, Lcom/microsoft/cognitiveservices/speech/SpeechConfig;->setSpeechSynthesisOutputFormat(Lcom/microsoft/cognitiveservices/speech/SpeechSynthesisOutputFormat;)V

    :cond_3
    invoke-virtual {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v2

    invoke-static {v2}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->I1(Lcom/sma/smartv3/util/MicrosoftSDKManage;)Lcom/microsoft/cognitiveservices/speech/SpeechConfig;

    move-result-object v2

    if-eqz v2, :cond_4

    iget-object v5, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$XOO0ii0;->I1:Ljava/lang/String;

    invoke-virtual {v2, v5}, Lcom/microsoft/cognitiveservices/speech/SpeechConfig;->setSpeechSynthesisVoiceName(Ljava/lang/String;)V

    :cond_4
    invoke-virtual {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v2

    new-instance v5, Lcom/microsoft/cognitiveservices/speech/SpeechSynthesizer;

    invoke-virtual {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v6

    invoke-static {v6}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->I1(Lcom/sma/smartv3/util/MicrosoftSDKManage;)Lcom/microsoft/cognitiveservices/speech/SpeechConfig;

    move-result-object v6

    invoke-direct {v5, v6, v3}, Lcom/microsoft/cognitiveservices/speech/SpeechSynthesizer;-><init>(Lcom/microsoft/cognitiveservices/speech/SpeechConfig;Lcom/microsoft/cognitiveservices/speech/audio/AudioConfig;)V

    invoke-static {v2, v5}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O(Lcom/sma/smartv3/util/MicrosoftSDKManage;Lcom/microsoft/cognitiveservices/speech/SpeechSynthesizer;)V

    :cond_5
    invoke-virtual {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v2

    invoke-static {v2, v4}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->IXXOO(Lcom/sma/smartv3/util/MicrosoftSDKManage;Z)V

    sget-object v2, Lcom/sma/smartv3/biz/StatManager;->OXO1:Lcom/sma/smartv3/biz/StatManager;

    const/16 v5, 0xa

    const/4 v6, 0x2

    invoke-static {v2, v5, v3, v6, v3}, Lcom/sma/smartv3/biz/StatManager;->iO(Lcom/sma/smartv3/biz/StatManager;ILjava/lang/String;ILjava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v2

    invoke-static {v2}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->II1Xi0(Lcom/sma/smartv3/util/MicrosoftSDKManage;)Lcom/microsoft/cognitiveservices/speech/SpeechSynthesizer;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v3, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$XOO0ii0;->IO:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/microsoft/cognitiveservices/speech/SpeechSynthesizer;->StartSpeakingTextAsync(Ljava/lang/String;)Ljava/util/concurrent/Future;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "get(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Lcom/microsoft/cognitiveservices/speech/SpeechSynthesisResult;

    invoke-static {v2}, Lcom/microsoft/cognitiveservices/speech/AudioDataStream;->fromResult(Lcom/microsoft/cognitiveservices/speech/SpeechSynthesisResult;)Lcom/microsoft/cognitiveservices/speech/AudioDataStream;

    move-result-object v2

    const/16 v3, 0x960

    new-array v3, v3, [B

    invoke-virtual {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v1

    invoke-static {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->i010I(Lcom/sma/smartv3/util/MicrosoftSDKManage;)Ljava/lang/String;

    move-result-object v1

    iget-object v5, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$XOO0ii0;->iX1O1:Lcom/sma/smartv3/model/LeftAndRightPlayControl;

    sget-object v7, Lcom/sma/smartv3/model/LeftAndRightPlayControl;->RIGHT:Lcom/sma/smartv3/model/LeftAndRightPlayControl;

    const/4 v8, 0x1

    if-eq v5, v7, :cond_6

    move v7, v8

    goto :goto_1

    :cond_6
    move v7, v4

    :goto_1
    sget-object v9, Lcom/sma/smartv3/model/LeftAndRightPlayControl;->LEFT:Lcom/sma/smartv3/model/LeftAndRightPlayControl;

    if-eq v5, v9, :cond_7

    move v9, v8

    goto :goto_2

    :cond_7
    move v9, v4

    :goto_2
    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " microsoftLeftOrRight = "

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    :goto_3
    sget-object v0, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v1

    invoke-static {v1}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->iOOX010X(Lcom/sma/smartv3/util/MicrosoftSDKManage;)Z

    move-result v1

    if-nez v1, :cond_10

    invoke-virtual {v2, v3}, Lcom/microsoft/cognitiveservices/speech/AudioDataStream;->readData([B)J

    move-result-wide v9

    const-wide/16 v11, 0x0

    cmp-long v1, v9, v11

    if-nez v1, :cond_8

    goto/16 :goto_a

    :cond_8
    const/16 v0, 0x12c0

    new-array v1, v0, [B

    move v5, v4

    :goto_4
    if-ge v5, v0, :cond_9

    aput-byte v4, v1, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_9
    const/16 v5, 0x95f

    invoke-static {v4, v5, v6}, Lkotlin/internal/ProgressionUtilKt;->iO(III)I

    move-result v5

    if-ltz v5, :cond_e

    move v7, v4

    :goto_5
    mul-int/lit8 v9, v7, 0x2

    iget-object v10, p0, Lcom/sma/smartv3/util/MicrosoftSDKManage$XOO0ii0;->iX1O1:Lcom/sma/smartv3/model/LeftAndRightPlayControl;

    sget-object v11, Lcom/sma/smartv3/model/LeftAndRightPlayControl;->RIGHT:Lcom/sma/smartv3/model/LeftAndRightPlayControl;

    if-eq v10, v11, :cond_a

    aget-byte v12, v3, v7

    goto :goto_6

    :cond_a
    move v12, v4

    :goto_6
    aput-byte v12, v1, v9

    add-int/lit8 v12, v9, 0x1

    if-eq v10, v11, :cond_b

    add-int/lit8 v11, v7, 0x1

    aget-byte v11, v3, v11

    goto :goto_7

    :cond_b
    move v11, v4

    :goto_7
    aput-byte v11, v1, v12

    add-int/lit8 v11, v9, 0x2

    sget-object v12, Lcom/sma/smartv3/model/LeftAndRightPlayControl;->LEFT:Lcom/sma/smartv3/model/LeftAndRightPlayControl;

    if-eq v10, v12, :cond_c

    aget-byte v13, v3, v7

    goto :goto_8

    :cond_c
    move v13, v4

    :goto_8
    aput-byte v13, v1, v11

    add-int/lit8 v9, v9, 0x3

    if-eq v10, v12, :cond_d

    add-int/lit8 v10, v7, 0x1

    aget-byte v10, v3, v10

    goto :goto_9

    :cond_d
    move v10, v4

    :goto_9
    aput-byte v10, v1, v9

    if-eq v7, v5, :cond_e

    add-int/lit8 v7, v7, 0x2

    goto :goto_5

    :cond_e
    sget-object v5, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v5}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v5

    invoke-static {v5}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->XiOIii1(Lcom/sma/smartv3/util/MicrosoftSDKManage;)Landroid/media/AudioTrack;

    move-result-object v5

    if-eqz v5, :cond_f

    invoke-virtual {v5, v1, v4, v0}, Landroid/media/AudioTrack;->write([BII)I

    :cond_f
    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->getMTtsFilePcm()Ljava/io/File;

    move-result-object v0

    invoke-static {v0, v3, v8}, Lcom/blankj/utilcode/util/FileIOUtils;->writeFileFromBytesByStream(Ljava/io/File;[BZ)Z

    goto :goto_3

    :cond_10
    :goto_a
    invoke-virtual {v0}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v0

    invoke-static {v0, v8}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->IXXOO(Lcom/sma/smartv3/util/MicrosoftSDKManage;Z)V

    invoke-virtual {v2}, Lcom/microsoft/cognitiveservices/speech/AudioDataStream;->close()V

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :goto_b
    sget-object v1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    sget-object v2, Lcom/sma/smartv3/util/MicrosoftSDKManage;->O1O:Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;

    invoke-virtual {v2}, Lcom/sma/smartv3/util/MicrosoftSDKManage$XIi00iiXO;->OXO1()Lcom/sma/smartv3/util/MicrosoftSDKManage;

    move-result-object v2

    invoke-static {v2}, Lcom/sma/smartv3/util/MicrosoftSDKManage;->i010I(Lcom/sma/smartv3/util/MicrosoftSDKManage;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " unexpected "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_c
    return-void
.end method
