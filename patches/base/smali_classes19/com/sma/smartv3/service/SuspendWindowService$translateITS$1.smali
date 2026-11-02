.class public final Lcom/sma/smartv3/service/SuspendWindowService$translateITS$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/service/SuspendWindowService;->translateITS(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/service/SuspendWindowService;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/service/SuspendWindowService;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService$translateITS$1;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/service/SuspendWindowService;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/service/SuspendWindowService$translateITS$1;->iO(Lcom/sma/smartv3/service/SuspendWindowService;)V

    return-void
.end method

.method public static final iO(Lcom/sma/smartv3/service/SuspendWindowService;)V
    .locals 4

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getTv_translate_t()Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->setRecordText()V

    invoke-static {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->access$getOnlyshowTranslate$p(Lcom/sma/smartv3/service/SuspendWindowService;)Z

    move-result v0

    const-string v1, "aura"

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getClipboard()Landroid/content/ClipboardManager;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getMExtraInfo()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getClipboard()Landroid/content/ClipboardManager;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getMExtraInfo()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lcom/sma/smartv3/service/SuspendWindowService;->getMContent()Ljava/lang/String;

    move-result-object p0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\n("

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    return-void
.end method


# virtual methods
.method public XIi00iiXO(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService$translateITS$1;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-static {v0}, Lcom/sma/smartv3/service/SuspendWindowService;->access$getTAG$p(Lcom/sma/smartv3/service/SuspendWindowService;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " translateITS text = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService$translateITS$1;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-static {p1}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/service/SuspendWindowService;->setMExtraInfo(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService$translateITS$1;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-static {p1}, Lcom/sma/smartv3/service/SuspendWindowService;->access$getHandle$p(Lcom/sma/smartv3/service/SuspendWindowService;)Landroid/os/Handler;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService$translateITS$1;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/uh5;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/uh5;-><init>(Lcom/sma/smartv3/service/SuspendWindowService;)V

    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    new-instance p1, Lcom/sma/smartv3/service/SuspendWindowService$XIi00iiXO;

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService$translateITS$1;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-virtual {v0}, Lcom/sma/smartv3/service/SuspendWindowService;->getMContent()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/service/SuspendWindowService$translateITS$1;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-virtual {v1}, Lcom/sma/smartv3/service/SuspendWindowService;->getMExtraInfo()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lcom/sma/smartv3/service/SuspendWindowService$XIi00iiXO;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "TRANSLATE_SUCCESS"

    invoke-static {v0, p1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->OXO1(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService$translateITS$1;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-virtual {p1}, Lcom/sma/smartv3/service/SuspendWindowService;->saveDBRecord()V

    iget-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService$translateITS$1;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-virtual {p1}, Lcom/sma/smartv3/service/SuspendWindowService;->sendTranslationResult()V

    iget-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService$translateITS$1;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-virtual {p1}, Lcom/sma/smartv3/service/SuspendWindowService;->getMExtraInfo()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->access$voiceChainAi(Lcom/sma/smartv3/service/SuspendWindowService;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService$translateITS$1;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    const-string v0, ""

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->setMContent(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService$translateITS$1;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->setMExtraInfo(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService$translateITS$1;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-virtual {p1}, Lcom/sma/smartv3/service/SuspendWindowService;->saveDBRecord()V

    iget-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService$translateITS$1;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-virtual {p1}, Lcom/sma/smartv3/service/SuspendWindowService;->sendTranslationResult()V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/service/SuspendWindowService$translateITS$1;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-static {v0}, Lcom/sma/smartv3/service/SuspendWindowService;->access$getTAG$p(Lcom/sma/smartv3/service/SuspendWindowService;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " translateITS text = "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService$translateITS$1;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    const-string v0, ""

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->setMContent(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService$translateITS$1;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/service/SuspendWindowService;->setMExtraInfo(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService$translateITS$1;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-virtual {p1}, Lcom/sma/smartv3/service/SuspendWindowService;->saveDBRecord()V

    iget-object p1, p0, Lcom/sma/smartv3/service/SuspendWindowService$translateITS$1;->OXO1:Lcom/sma/smartv3/service/SuspendWindowService;

    invoke-virtual {p1}, Lcom/sma/smartv3/service/SuspendWindowService;->sendTranslationResult()V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/service/SuspendWindowService$translateITS$1;->XIi00iiXO(Ljava/lang/String;)V

    return-void
.end method
