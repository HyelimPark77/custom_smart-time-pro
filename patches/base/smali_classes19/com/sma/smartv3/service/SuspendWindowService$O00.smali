.class public final Lcom/sma/smartv3/service/SuspendWindowService$O00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/util/MicrosoftSDKManage$iO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/service/SuspendWindowService;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/service/SuspendWindowService;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/service/SuspendWindowService;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService$O00;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final IiI10X(Lcom/sma/smartv3/service/SuspendWindowService;)V
    .locals 1

    const-string v0, ""

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->setMContentResult(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->showRecordingPopup()V

    return-void
.end method

.method public static final O00(ILcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/service/SuspendWindowService;->setMContent(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/service/SuspendWindowService;->getTv_original_t()Landroid/widget/TextView;

    move-result-object p0

    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/service/SuspendWindowService;->getTv_original_t()Landroid/widget/TextView;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p0, p2}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p1}, Lcom/sma/smartv3/service/SuspendWindowService;->isAddListData()Z

    move-result p0

    if-nez p0, :cond_0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->setAddListData(Z)V

    :cond_0
    return-void
.end method

.method public static synthetic XIi00iiXO(ILcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/service/SuspendWindowService$O00;->O00(ILcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/service/SuspendWindowService;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/service/SuspendWindowService$O00;->XOO0ii0(Lcom/sma/smartv3/service/SuspendWindowService;)V

    return-void
.end method

.method public static final XOO0ii0(Lcom/sma/smartv3/service/SuspendWindowService;)V
    .locals 6

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->disRecordingPopup()V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    invoke-static {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->access$getTAG$p(Lcom/sma/smartv3/service/SuspendWindowService;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->isEndTranslation()Z

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

    const/4 v2, 0x0

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/service/SuspendWindowService;->showRecordingPopup(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->isEndTranslation()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/service/SuspendWindowService;->setEndTranslation(Z)V

    invoke-virtual {p0, v2}, Lcom/sma/smartv3/service/SuspendWindowService;->setAddListData(Z)V

    sget-object v3, Lcom/sma/smartv3/biz/voice/VoiceManager;->INSTANCE:Lcom/sma/smartv3/biz/voice/VoiceManager;

    invoke-virtual {v3, v2}, Lcom/sma/smartv3/biz/voice/VoiceManager;->setSpeechRecRunning(Z)V

    invoke-static {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->access$getTAG$p(Lcom/sma/smartv3/service/SuspendWindowService;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getMContentResult()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "  sendTranslate onStopTransmission  show content = "

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getMContentResult()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v3

    const-string v4, "  sendTranslate onStopTransmission  content = "

    if-lez v3, :cond_0

    invoke-static {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->access$getTAG$p(Lcom/sma/smartv3/service/SuspendWindowService;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getMContentResult()Ljava/lang/String;

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

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getMContentResult()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->access$sendTranslationResultInput(Lcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-static {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->access$getTAG$p(Lcom/sma/smartv3/service/SuspendWindowService;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getMContentResult()Ljava/lang/String;

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

    const v0, 0x7f140ff9

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->access$sendTranslationResultInput(Lcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public static synthetic iO(Lcom/sma/smartv3/service/SuspendWindowService;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/service/SuspendWindowService$O00;->IiI10X(Lcom/sma/smartv3/service/SuspendWindowService;)V

    return-void
.end method


# virtual methods
.method public onIdentifyResults(ILjava/lang/String;)V
    .locals 3

    const-string v0, "str"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService$O00;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-static {v1}, Lcom/sma/smartv3/service/SuspendWindowService;->access$getTAG$p(Lcom/sma/smartv3/service/SuspendWindowService;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "  sendTranslate  onIdentifyResults Show Content is : "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService$O00;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-virtual {v1, p2}, Lcom/sma/smartv3/service/SuspendWindowService;->setMContentResult(Ljava/lang/String;)V

    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService$O00;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-static {v1}, Lcom/sma/smartv3/service/SuspendWindowService;->access$getTAG$p(Lcom/sma/smartv3/service/SuspendWindowService;)Ljava/lang/String;

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

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService$O00;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-virtual {v0, p2}, Lcom/sma/smartv3/service/SuspendWindowService;->setMContentResult(Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService$O00;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-static {v0}, Lcom/sma/smartv3/service/SuspendWindowService;->access$getHandle$p(Lcom/sma/smartv3/service/SuspendWindowService;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService$O00;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/ph5;

    invoke-direct {v2, p1, v1, p2}, Lcom/android/mltcode/paycertificationapi/ph5;-><init>(ILcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

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

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService$O00;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-static {v1}, Lcom/sma/smartv3/service/SuspendWindowService;->access$getTAG$p(Lcom/sma/smartv3/service/SuspendWindowService;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " onStartTransmission "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService$O00;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-static {v0}, Lcom/sma/smartv3/service/SuspendWindowService;->access$getHandle$p(Lcom/sma/smartv3/service/SuspendWindowService;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService$O00;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/oh5;

    invoke-direct {v2, v1}, Lcom/android/mltcode/paycertificationapi/oh5;-><init>(Lcom/sma/smartv3/service/SuspendWindowService;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onStopTransmission()V
    .locals 3

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService$O00;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-static {v0}, Lcom/sma/smartv3/service/SuspendWindowService;->access$getHandle$p(Lcom/sma/smartv3/service/SuspendWindowService;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService$O00;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/qh5;

    invoke-direct {v2, v1}, Lcom/android/mltcode/paycertificationapi/qh5;-><init>(Lcom/sma/smartv3/service/SuspendWindowService;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
