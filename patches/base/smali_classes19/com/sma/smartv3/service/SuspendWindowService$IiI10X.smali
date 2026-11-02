.class public final Lcom/sma/smartv3/service/SuspendWindowService$IiI10X;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;


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

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService$IiI10X;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final IiI10X(Lcom/sma/smartv3/service/SuspendWindowService;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->disRecordingPopup()V

    return-void
.end method

.method public static final O00(Lcom/sma/smartv3/service/SuspendWindowService;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->showRecordingPopup()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/service/SuspendWindowService;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/service/SuspendWindowService$IiI10X;->IiI10X(Lcom/sma/smartv3/service/SuspendWindowService;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/service/SuspendWindowService;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/service/SuspendWindowService$IiI10X;->O00(Lcom/sma/smartv3/service/SuspendWindowService;)V

    return-void
.end method

.method public static final XO0O10(Lcom/sma/smartv3/service/SuspendWindowService;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->showRecordingPopup()V

    return-void
.end method

.method public static synthetic iO(Lcom/sma/smartv3/service/SuspendWindowService;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/service/SuspendWindowService$IiI10X;->XO0O10(Lcom/sma/smartv3/service/SuspendWindowService;)V

    return-void
.end method


# virtual methods
.method public onBeforeRecording()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService$IiI10X;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-static {v1}, Lcom/sma/smartv3/service/SuspendWindowService;->access$getTAG$p(Lcom/sma/smartv3/service/SuspendWindowService;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " onBeforeRecording "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService$IiI10X;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-static {v0}, Lcom/sma/smartv3/service/SuspendWindowService;->access$getHandle$p(Lcom/sma/smartv3/service/SuspendWindowService;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService$IiI10X;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/rh5;

    invoke-direct {v2, v1}, Lcom/android/mltcode/paycertificationapi/rh5;-><init>(Lcom/sma/smartv3/service/SuspendWindowService;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onRecordResult(Lcom/sma/smartv3/model/AITranslation;)V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService$IiI10X;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-static {v1}, Lcom/sma/smartv3/service/SuspendWindowService;->access$getTAG$p(Lcom/sma/smartv3/service/SuspendWindowService;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " onRecordResult result = "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AITranslation;->getStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->stop()V

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService$IiI10X;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AITranslation;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/service/SuspendWindowService;->setMContent(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService$IiI10X;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AITranslation;->getDst()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/service/SuspendWindowService;->setMExtraInfo(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService$IiI10X;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-virtual {p1}, Lcom/sma/smartv3/service/SuspendWindowService;->getMContent()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_0

    iget-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService$IiI10X;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-virtual {p1}, Lcom/sma/smartv3/service/SuspendWindowService;->getMContent()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->sendTranslate(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public onRecordResultError(Ljava/lang/String;)V
    .locals 4

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService$IiI10X;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    const v0, 0x7f141286

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/sma/smartv3/service/SuspendWindowService$IiI10X;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    const v3, 0x7f140bb1

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0, v2}, Lcom/sma/smartv3/service/SuspendWindowService;->sendTranslationResult(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public bridge onRecordResultLanguage(Lcom/sma/smartv3/model/AISpeech;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;->onRecordResultLanguage(Lcom/sma/smartv3/model/AISpeech;)V

    return-void
.end method

.method public onStartRecording()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService$IiI10X;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-static {v1}, Lcom/sma/smartv3/service/SuspendWindowService;->access$getTAG$p(Lcom/sma/smartv3/service/SuspendWindowService;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " onStartRecording "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService$IiI10X;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-static {v0}, Lcom/sma/smartv3/service/SuspendWindowService;->access$getHandle$p(Lcom/sma/smartv3/service/SuspendWindowService;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService$IiI10X;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/sh5;

    invoke-direct {v2, v1}, Lcom/android/mltcode/paycertificationapi/sh5;-><init>(Lcom/sma/smartv3/service/SuspendWindowService;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public onStopRecording()V
    .locals 3

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService$IiI10X;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-static {v1}, Lcom/sma/smartv3/service/SuspendWindowService;->access$getTAG$p(Lcom/sma/smartv3/service/SuspendWindowService;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " onStartRecording "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService$IiI10X;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-static {v0}, Lcom/sma/smartv3/service/SuspendWindowService;->access$getHandle$p(Lcom/sma/smartv3/service/SuspendWindowService;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService$IiI10X;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    new-instance v2, Lcom/android/mltcode/paycertificationapi/th5;

    invoke-direct {v2, v1}, Lcom/android/mltcode/paycertificationapi/th5;-><init>(Lcom/sma/smartv3/service/SuspendWindowService;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
