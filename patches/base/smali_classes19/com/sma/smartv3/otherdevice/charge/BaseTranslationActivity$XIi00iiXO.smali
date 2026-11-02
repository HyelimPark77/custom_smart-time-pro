.class public final Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$XIi00iiXO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final IiI10X(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V
    .locals 1

    const-string v0, ""

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setMContentResult(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->showRecordingPopup()V

    return-void
.end method

.method public static final O00(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;ILjava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->isAddListData()Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p0, v1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setAddListData(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->addList()V

    :cond_0
    if-ne p1, v1, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMHandler()Landroid/os/Handler;

    move-result-object p1

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->access$getLoadTimeOut$p(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMHandler()Landroid/os/Handler;

    move-result-object p1

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->access$getLoadTimeOutToast$p(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeMessages(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMAIRecords()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/db/entity/AIRecords;->setMContent(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->upDataLastList()V

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->access$notifyView(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    :cond_2
    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$XIi00iiXO;->IiI10X(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    return-void
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$XIi00iiXO;->XOO0ii0(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    return-void
.end method

.method public static final XOO0ii0(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V
    .locals 6

    sget-object v0, Lcom/sma/smartv3/biz/voice/RecordingManager;->Companion:Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager$Companion;->getInstance()Lcom/sma/smartv3/biz/voice/RecordingManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/RecordingManager;->closeBluetooth()V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->disRecordingPopup()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->access$getTAG$p(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->isEndTranslation()Z

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "   onStopTransmission  isEndTranslation = "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->isEndTranslation()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setEndTranslation(Z)V

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setAddListData(Z)V

    sget-object v3, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-virtual {v3, v2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setSpeechRecRunning(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMContentResult()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const-string v4, "  sendTranslate onStopTransmission  content = "

    if-lez v3, :cond_0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->access$getTAG$p(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMContentResult()Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMContentResult()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->access$sendTranslationResultInput(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->access$getTAG$p(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMContentResult()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-lez v3, :cond_1

    const/4 v2, 0x1

    :cond_1
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->stop()V

    const v0, 0x7f141196

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->access$sendTranslationResultInput(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public static synthetic iO(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;ILjava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$XIi00iiXO;->O00(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;ILjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onIdentifyResults(ILjava/lang/String;)V
    .locals 4

    const-string v0, "str"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-static {v1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->access$getTAG$p(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  sendTranslate  onIdentifyResults content = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-virtual {v0, p2}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->setMContentResult(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMHandler()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-static {v1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->access$getLoadTimeOut$p(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)I

    move-result v1

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/I11i110I1;

    invoke-direct {v1, v0, p1, p2}, Lcom/android/mltcode/paycertificationapi/I11i110I1;-><init>(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public bridge onIdentifyResultsDetectedLanguage(ILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;->onIdentifyResultsDetectedLanguage(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onStartTransmission()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-static {v1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->access$getTAG$p(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " onStartTransmission "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/OiiXOI1;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/OiiXOI1;-><init>(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onStopTransmission()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$XIi00iiXO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IOI01IIIO;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/IOI01IIIO;-><init>(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
