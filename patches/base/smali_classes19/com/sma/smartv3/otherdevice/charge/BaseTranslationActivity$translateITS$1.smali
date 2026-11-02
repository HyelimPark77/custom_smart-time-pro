.class public final Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$translateITS$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->translateITS(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
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
.field public final synthetic OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$translateITS$1;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/lang/String;)V
    .locals 10

    if-eqz p1, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$translateITS$1;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMAIRecords()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {p1}, Lkotlin/text/StringsKt__StringsKt;->iX1X1(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/db/entity/AIRecords;->setMExtraInfo(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$translateITS$1;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->upDataLastList()V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$translateITS$1;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-static {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->access$notifyView(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$translateITS$1;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->saveDBRecord()V

    sget-object v1, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->INSTANCE:Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$translateITS$1;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getTtsVoiceName()Ljava/lang/String;

    move-result-object v6

    const/16 v8, 0xc

    const/4 v9, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v7, "translateITS1"

    move-object v2, p1

    invoke-static/range {v1 .. v9}, Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;->play$default(Lcom/sma/smartv3/biz/voice/DcsTtsPlayer;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$translateITS$1;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMAIRecords()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const-string v0, "translate error"

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/db/entity/AIRecords;->setMExtraInfo(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$translateITS$1;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->upDataLastList()V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$translateITS$1;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-static {p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->access$notifyView(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$translateITS$1;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->saveDBRecord()V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 2

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$translateITS$1;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->getMAIRecords()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$translateITS$1;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    const v1, 0x7f140bb1

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/db/entity/AIRecords;->setMExtraInfo(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$translateITS$1;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->upDataLastList()V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$translateITS$1;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-static {p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->access$notifyView(Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;)V

    iget-object p1, p0, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$translateITS$1;->OXO1:Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;

    invoke-virtual {p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity;->saveDBRecord()V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/otherdevice/charge/BaseTranslationActivity$translateITS$1;->OXO1(Ljava/lang/String;)V

    return-void
.end method
