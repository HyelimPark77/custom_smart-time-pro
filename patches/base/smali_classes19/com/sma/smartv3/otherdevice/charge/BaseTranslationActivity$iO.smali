.class public final Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$iO;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBaseTranslationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$recordingCallBack$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,775:1\n1#2:776\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBaseTranslationActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseTranslationActivity.kt\ncom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$recordingCallBack$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,775:1\n1#2:776\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$iO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$iO;->iO(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$iO;->XO0O10(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    return-void
.end method

.method public static final XO0O10(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->disRecordingPopup()V

    return-void
.end method

.method public static final iO(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->showRecordingPopup()V

    return-void
.end method


# virtual methods
.method public onBeforeRecording()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$iO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O0OXX0;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/O0OXX0;-><init>(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onRecordResult(Lcom/sma/smartv3/model/AITranslation;)V
    .locals 4

    if-eqz p1, :cond_8

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AITranslation;->getStatus()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_8

    sget-object v0, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->stop()V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$iO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMAIRecords()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AITranslation;->getText()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$iO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMAIRecords()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/AIRecords;->getMContent()Ljava/lang/String;

    move-result-object v1

    :cond_0
    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/AIRecords;->setMContent(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$iO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMAIRecords()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AITranslation;->getDst()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$iO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMAIRecords()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/AIRecords;->getMExtraInfo()Ljava/lang/String;

    move-result-object p1

    :cond_2
    invoke-virtual {v0, p1}, Lcom/sma/smartv3/db/entity/AIRecords;->setMExtraInfo(Ljava/lang/String;)V

    :cond_3
    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$iO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->addList()V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$iO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-static {p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->access$notifyView(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$iO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMAIRecords()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/AIRecords;->getMContent()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_5

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$iO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMAIRecords()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/AIRecords;->getMContent()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->sendTranslate(Ljava/lang/String;)V

    return-void

    :cond_5
    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$iO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMAIRecords()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object p1

    if-eqz p1, :cond_6

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$iO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    const v1, 0x7f141173

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/db/entity/AIRecords;->setMContent(Ljava/lang/String;)V

    :cond_6
    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$iO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMAIRecords()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object p1

    if-eqz p1, :cond_7

    const-string v0, ""

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/db/entity/AIRecords;->setMExtraInfo(Ljava/lang/String;)V

    :cond_7
    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$iO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->upDataLastList()V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$iO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-static {p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->access$notifyView(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$iO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->saveDBRecord()V

    :cond_8
    return-void
.end method

.method public onRecordResultError(Ljava/lang/String;)V
    .locals 4

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$iO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    const v0, 0x7f141286

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$iO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    const v3, 0x7f140bb1

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0, v2}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->sendTranslationResult(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public bridge onRecordResultLanguage(Lcom/sma/smartv3/model/AISpeech;)V
    .locals 0

    invoke-super {p0, p1}, Lcom/sma/smartv3/biz/voice/RecordingManager$OnRecordingCallback;->onRecordResultLanguage(Lcom/sma/smartv3/model/AISpeech;)V

    return-void
.end method

.method public onStartRecording()V
    .locals 0

    return-void
.end method

.method public onStopRecording()V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$iO;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XX0X0IX;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/XX0X0IX;-><init>(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method
