.class public final Lcom/sma/smartv3/ui/ai/BaseAIActivity$send$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/ai/BaseAIActivity;->send(Lcom/sma/smartv3/model/AIQuestion;Lcom/sma/smartv3/ui/ai/BaseAIActivity$OXO1;ZZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Lcom/sma/smartv3/model/AIAnswer;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBaseAIActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseAIActivity.kt\ncom/sma/smartv3/ui/ai/BaseAIActivity$send$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,242:1\n69#2,3:243\n72#2,5:247\n1#3:246\n*S KotlinDebug\n*F\n+ 1 BaseAIActivity.kt\ncom/sma/smartv3/ui/ai/BaseAIActivity$send$1\n*L\n181#1:243,3\n181#1:247,5\n181#1:246\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBaseAIActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseAIActivity.kt\ncom/sma/smartv3/ui/ai/BaseAIActivity$send$1\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,242:1\n69#2,3:243\n72#2,5:247\n1#3:246\n*S KotlinDebug\n*F\n+ 1 BaseAIActivity.kt\ncom/sma/smartv3/ui/ai/BaseAIActivity$send$1\n*L\n181#1:243,3\n181#1:247,5\n181#1:246\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Z

.field public final synthetic XIi00iiXO:Lcom/sma/smartv3/ui/ai/BaseAIActivity;


# direct methods
.method public constructor <init>(ZLcom/sma/smartv3/ui/ai/BaseAIActivity;)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity$send$1;->OXO1:Z

    iput-object p2, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity$send$1;->XIi00iiXO:Lcom/sma/smartv3/ui/ai/BaseAIActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final O00(Lcom/sma/smartv3/ui/ai/BaseAIActivity;Lcom/sma/smartv3/model/AIAnswer;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->access$getMAIAnswerCallback$p(Lcom/sma/smartv3/ui/ai/BaseAIActivity;)Lcom/sma/smartv3/ui/ai/BaseAIActivity$OXO1;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lcom/sma/smartv3/ui/ai/BaseAIActivity$OXO1;->XIi00iiXO(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static synthetic OXO1(Lcom/sma/smartv3/ui/ai/BaseAIActivity;Lcom/sma/smartv3/model/AIAnswer;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/ai/BaseAIActivity$send$1;->O00(Lcom/sma/smartv3/ui/ai/BaseAIActivity;Lcom/sma/smartv3/model/AIAnswer;)V

    return-void
.end method

.method public static synthetic XIi00iiXO(Ljava/lang/String;Lcom/sma/smartv3/ui/ai/BaseAIActivity;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/ai/BaseAIActivity$send$1;->iO(Ljava/lang/String;Lcom/sma/smartv3/ui/ai/BaseAIActivity;)V

    return-void
.end method

.method public static final iO(Ljava/lang/String;Lcom/sma/smartv3/ui/ai/BaseAIActivity;)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0x1774c2

    if-eq v0, v1, :cond_5

    const v1, 0x185d82

    if-eq v0, v1, :cond_3

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const-string v0, "5003"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/ai/AIBenefitExpiredTipActivity;

    invoke-direct {v0, p1, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    :pswitch_1
    const-string v0, "5002"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    const v0, 0x7f1400bc

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->showPayTipPopup(I)V

    goto :goto_0

    :pswitch_2
    const-string v0, "5001"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const v0, 0x7f1400bb

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->showPayTipPopup(I)V

    goto :goto_0

    :cond_3
    const-string v0, "4006"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const v0, 0x7f1410fc

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->showPayTipPopup(I)V

    goto :goto_0

    :cond_5
    const-string v0, "2004"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_0

    :cond_6
    const v0, 0x7f140e38

    invoke-static {v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(I)V

    :goto_0
    invoke-static {p1}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->access$getMAIAnswerCallback$p(Lcom/sma/smartv3/ui/ai/BaseAIActivity;)Lcom/sma/smartv3/ui/ai/BaseAIActivity$OXO1;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-interface {p1, p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity$OXO1;->OXO1(Ljava/lang/String;)V

    :cond_7
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x18d1dc
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public XO0O10(Lcom/sma/smartv3/model/AIAnswer;)V
    .locals 4

    if-eqz p1, :cond_1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity$send$1;->OXO1:Z

    iget-object v1, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity$send$1;->XIi00iiXO:Lcom/sma/smartv3/ui/ai/BaseAIActivity;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "handleResponse AIAnswer = "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    if-eqz v0, :cond_0

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getMReceivedRecords()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/db/entity/AIRecords;->setMStatus(I)V

    invoke-virtual {p1}, Lcom/sma/smartv3/model/AIAnswer;->getText()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/db/entity/AIRecords;->setMContent(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getMRecordsDao()Lcom/sma/smartv3/db/dao/AIRecordsDao;

    move-result-object v2

    invoke-interface {v2, v0}, Lcom/sma/smartv3/db/dao/AIRecordsDao;->update(Lcom/sma/smartv3/db/entity/AIRecords;)I

    :cond_0
    new-instance v0, Lcom/android/mltcode/paycertificationapi/iOiIXOI1;

    invoke-direct {v0, v1, p1}, Lcom/android/mltcode/paycertificationapi/iOiIXOI1;-><init>(Lcom/sma/smartv3/ui/ai/BaseAIActivity;Lcom/sma/smartv3/model/AIAnswer;)V

    invoke-virtual {v1, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 4

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "handleResponse error = "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity$send$1;->XIi00iiXO:Lcom/sma/smartv3/ui/ai/BaseAIActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getMReceivedRecords()Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity$send$1;->XIi00iiXO:Lcom/sma/smartv3/ui/ai/BaseAIActivity;

    const/4 v2, 0x2

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/db/entity/AIRecords;->setMStatus(I)V

    const v2, 0x7f140c43

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "getString(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/db/entity/AIRecords;->setMContent(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getMRecordsDao()Lcom/sma/smartv3/db/dao/AIRecordsDao;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/sma/smartv3/db/dao/AIRecordsDao;->update(Lcom/sma/smartv3/db/entity/AIRecords;)I

    :cond_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity$send$1;->XIi00iiXO:Lcom/sma/smartv3/ui/ai/BaseAIActivity;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/IXOXOOi;

    invoke-direct {v1, p1, v0}, Lcom/android/mltcode/paycertificationapi/IXOXOOi;-><init>(Ljava/lang/String;Lcom/sma/smartv3/ui/ai/BaseAIActivity;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/sma/smartv3/model/AIAnswer;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/BaseAIActivity$send$1;->XO0O10(Lcom/sma/smartv3/model/AIAnswer;)V

    return-void
.end method
