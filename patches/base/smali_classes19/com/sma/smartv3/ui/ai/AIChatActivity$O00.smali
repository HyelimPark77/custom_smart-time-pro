.class public final Lcom/sma/smartv3/ui/ai/AIChatActivity$O00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/ai/AIChatActivity;->startRecording()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$O00;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final I0IIOi(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V
    .locals 1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->disRecordingPopup()V

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->access$setRecording$p(Lcom/sma/smartv3/ui/ai/AIChatActivity;Z)V

    return-void
.end method

.method public static final IiI10X(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->disRecordingPopup()V

    return-void
.end method

.method public static final O00(Lcom/sma/smartv3/ui/ai/AIChatActivity;Lcom/sma/smartv3/model/AITranslation;)V
    .locals 0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AITranslation;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->access$addQuestion(Lcom/sma/smartv3/ui/ai/AIChatActivity;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity$O00;->I0IIOi(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity$O00;->XOO0ii0(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    return-void
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/ai/AIChatActivity;Lcom/sma/smartv3/model/AITranslation;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/ai/AIChatActivity$O00;->O00(Lcom/sma/smartv3/ui/ai/AIChatActivity;Lcom/sma/smartv3/model/AITranslation;)V

    return-void
.end method

.method public static final XOO0ii0(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->showRecordingPopup()V

    return-void
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/AIChatActivity$O00;->IiI10X(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    return-void
.end method


# virtual methods
.method public onBeforeRecording()V
    .locals 0

    return-void
.end method

.method public onRecordResult(Lcom/sma/smartv3/model/AITranslation;)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AITranslation;->getStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$O00;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/ai/AIChatActivity;->getRecordingIsClear()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$O00;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IO0iXO0O;

    invoke-direct {v1, v0, p1}, Lcom/android/mltcode/paycertificationapi/IO0iXO0O;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;Lcom/sma/smartv3/model/AITranslation;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method

.method public onRecordResultError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$O00;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iiIOiX;

    invoke-direct {v0, p1}, Lcom/android/mltcode/paycertificationapi/iiIOiX;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public bridge onRecordResultLanguage(Lcom/sma/smartv3/model/AISpeech;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;->onRecordResultLanguage(Lcom/sma/smartv3/model/AISpeech;)V

    return-void
.end method

.method public onStartRecording()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$O00;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XX00i10X;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/XX00i10X;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onStopRecording()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/AIChatActivity$O00;->OXO1:Lcom/sma/smartv3/ui/ai/AIChatActivity;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/Oi;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/Oi;-><init>(Lcom/sma/smartv3/ui/ai/AIChatActivity;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
