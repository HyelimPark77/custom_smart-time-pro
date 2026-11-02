.class public abstract Lcom/sma/smartv3/ui/ai/BaseAIActivity;
.super Lcom/bestmafen/androidbase/base/BaseActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/ai/BaseAIActivity$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nBaseAIActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseAIActivity.kt\ncom/sma/smartv3/ui/ai/BaseAIActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,242:1\n87#2,7:243\n94#2,3:251\n70#2,7:254\n97#2:261\n1#3:250\n*S KotlinDebug\n*F\n+ 1 BaseAIActivity.kt\ncom/sma/smartv3/ui/ai/BaseAIActivity\n*L\n219#1:243,7\n219#1:251,3\n219#1:254,7\n219#1:261\n219#1:250\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nBaseAIActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseAIActivity.kt\ncom/sma/smartv3/ui/ai/BaseAIActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,242:1\n87#2,7:243\n94#2,3:251\n70#2,7:254\n97#2:261\n1#3:250\n*S KotlinDebug\n*F\n+ 1 BaseAIActivity.kt\ncom/sma/smartv3/ui/ai/BaseAIActivity\n*L\n219#1:243,7\n219#1:251,3\n219#1:254,7\n219#1:261\n219#1:250\n*E\n"
    }
.end annotation


# instance fields
.field private isPlayResult:Z

.field private mAIAnswerCallback:Lcom/sma/smartv3/ui/ai/BaseAIActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/sma/smartv3/ui/ai/BaseAIActivity$OXO1<",
            "Lcom/sma/smartv3/model/AIAnswer;",
            ">;"
        }
    .end annotation
.end field

.field private mAIFunction:Lcom/sma/smartv3/model/AIFunction;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mEvaluationPopup:Lcom/android/mltcode/paycertificationapi/I0iiIOX;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mModleSetPopup:Lcom/android/mltcode/paycertificationapi/dj4;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mPayTipPopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mReceivedRecords:Lcom/sma/smartv3/db/entity/AIRecords;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mRecordsDao:Lcom/sma/smartv3/db/dao/AIRecordsDao;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private openAIDeductionPoints:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->isPlayResult:Z

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->aiRecordsDao()Lcom/sma/smartv3/db/dao/AIRecordsDao;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mRecordsDao:Lcom/sma/smartv3/db/dao/AIRecordsDao;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/ai/BaseAIActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->showPayTipPopup$lambda$0$0(Lcom/sma/smartv3/ui/ai/BaseAIActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/ai/BaseAIActivity;I)Z
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->onSetModel$lambda$0$0(Lcom/sma/smartv3/ui/ai/BaseAIActivity;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/ai/BaseAIActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->dismissLoading$lambda$0(Lcom/sma/smartv3/ui/ai/BaseAIActivity;)V

    return-void
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/ai/BaseAIActivity;Lcom/sma/smartv3/model/DeductionConfig;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getDeductionConfig$lambda$0(Lcom/sma/smartv3/ui/ai/BaseAIActivity;Lcom/sma/smartv3/model/DeductionConfig;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Lcom/sma/smartv3/ui/ai/BaseAIActivity;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->showLoading$lambda$0(Lcom/sma/smartv3/ui/ai/BaseAIActivity;Z)V

    return-void
.end method

.method public static final synthetic access$getMAIAnswerCallback$p(Lcom/sma/smartv3/ui/ai/BaseAIActivity;)Lcom/sma/smartv3/ui/ai/BaseAIActivity$OXO1;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mAIAnswerCallback:Lcom/sma/smartv3/ui/ai/BaseAIActivity$OXO1;

    return-object p0
.end method

.method private static final dismissLoading$lambda$0(Lcom/sma/smartv3/ui/ai/BaseAIActivity;)V
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->dismiss()V

    :cond_0
    return-void
.end method

.method private final getDeductionConfig()V
    .locals 2

    sget-object v0, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O00XXO;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/O00XXO;-><init>(Lcom/sma/smartv3/ui/ai/BaseAIActivity;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/biz/OrderManager;->OIX0iXi(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final getDeductionConfig$lambda$0(Lcom/sma/smartv3/ui/ai/BaseAIActivity;Lcom/sma/smartv3/model/DeductionConfig;)Lkotlin/Unit;
    .locals 0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/sma/smartv3/model/DeductionConfig;->getOpenAI_ImgPoints()I

    move-result p1

    iput p1, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->openAIDeductionPoints:I

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->showAIDeductionPoints()V

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final onSetModel$lambda$0$0(Lcom/sma/smartv3/ui/ai/BaseAIActivity;I)Z
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "AI_MODEL"

    invoke-virtual {v0, v1, p1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;I)V

    const/4 p1, 0x0

    const/4 v0, 0x2

    const-string v1, "CHANGE_AI_MODEL"

    invoke-static {v1, p1, v0, p1}, Lcom/android/mltcode/paycertificationapi/I01XX0;->XIi00iiXO(Ljava/lang/String;Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->changeAiModel()V

    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic send$default(Lcom/sma/smartv3/ui/ai/BaseAIActivity;Lcom/sma/smartv3/model/AIQuestion;Lcom/sma/smartv3/ui/ai/BaseAIActivity$OXO1;ZZZILjava/lang/Object;)V
    .locals 6

    if-nez p7, :cond_4

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const/4 p2, 0x0

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    iget-boolean p3, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->isPlayResult:Z

    :cond_1
    move v3, p3

    and-int/lit8 p2, p6, 0x8

    const/4 p3, 0x1

    if-eqz p2, :cond_2

    move v4, p3

    goto :goto_0

    :cond_2
    move v4, p4

    :goto_0
    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_3

    move v5, p3

    :goto_1
    move-object v0, p0

    move-object v1, p1

    goto :goto_2

    :cond_3
    move v5, p5

    goto :goto_1

    :goto_2
    invoke-virtual/range {v0 .. v5}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->send(Lcom/sma/smartv3/model/AIQuestion;Lcom/sma/smartv3/ui/ai/BaseAIActivity$OXO1;ZZZ)V

    return-void

    :cond_4
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: send"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic showLoading$default(Lcom/sma/smartv3/ui/ai/BaseAIActivity;ZILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->showLoading(Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: showLoading"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final showLoading$lambda$0(Lcom/sma/smartv3/ui/ai/BaseAIActivity;Z)V
    .locals 2

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-nez v0, :cond_1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/uq;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/android/mltcode/paycertificationapi/uq;-><init>(Landroid/app/Activity;)V

    if-eqz p1, :cond_0

    const p1, 0x7f140c47

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/uq;->I1(Ljava/lang/Integer;)V

    :cond_0
    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    :cond_1
    iget-object p0, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_2
    return-void
.end method

.method public static synthetic showPayTipPopup$default(Lcom/sma/smartv3/ui/ai/BaseAIActivity;IILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const p1, 0x7f1410fc

    :cond_0
    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->showPayTipPopup(I)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: showPayTipPopup"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static final showPayTipPopup$lambda$0$0(Lcom/sma/smartv3/ui/ai/BaseAIActivity;)Z
    .locals 4

    sget-object v0, Lcom/sma/smartv3/biz/OrderManager;->OXO1:Lcom/sma/smartv3/biz/OrderManager;

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-static {v0, v2, v2, v1, v2}, Lcom/sma/smartv3/biz/OrderManager;->X11iII1O1(Lcom/sma/smartv3/biz/OrderManager;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Landroid/os/Bundle;

    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    const-string v3, "mArg0"

    invoke-virtual {v1, v3, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "mArg1"

    const/4 v3, 0x2

    invoke-virtual {v1, v0, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "mArg2"

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "mArg3"

    invoke-virtual {v1, v0, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance v0, Landroid/content/Intent;

    const-class v2, Lcom/sma/smartv3/ui/me/GoogleWebViewActivity;

    invoke-direct {v0, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public final addReceivedRecord()Lcom/sma/smartv3/db/entity/AIRecords;
    .locals 22
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    move-object/from16 v0, p0

    .line 1
    new-instance v1, Lcom/sma/smartv3/db/entity/AIRecords;

    iget-object v2, v0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mAIFunction:Lcom/sma/smartv3/model/AIFunction;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AIFunction;->getType()Lcom/sma/smartv3/model/AIFunctionType;

    move-result-object v2

    invoke-virtual {v2}, Lcom/sma/smartv3/model/AIFunctionType;->getType()I

    move-result v6

    const v20, 0x1ff67

    const/16 v21, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v1 .. v21}, Lcom/sma/smartv3/db/entity/AIRecords;-><init>(IJLjava/lang/String;IILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->addReceivedRecord(Lcom/sma/smartv3/db/entity/AIRecords;)Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object v1

    return-object v1
.end method

.method public final addReceivedRecord(Lcom/sma/smartv3/db/entity/AIRecords;)Lcom/sma/smartv3/db/entity/AIRecords;
    .locals 2
    .param p1    # Lcom/sma/smartv3/db/entity/AIRecords;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "mAIRecords"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mRecordsDao:Lcom/sma/smartv3/db/dao/AIRecordsDao;

    invoke-interface {v0, p1}, Lcom/sma/smartv3/db/dao/AIRecordsDao;->insert(Lcom/sma/smartv3/db/entity/AIRecords;)J

    move-result-wide v0

    .line 3
    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mRecordsDao:Lcom/sma/smartv3/db/dao/AIRecordsDao;

    invoke-interface {p1, v0, v1}, Lcom/sma/smartv3/db/dao/AIRecordsDao;->getAIRecord(J)Lcom/sma/smartv3/db/entity/AIRecords;

    move-result-object p1

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mReceivedRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    .line 4
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    return-object p1
.end method

.method public final addSendRecord(Lcom/sma/smartv3/db/entity/AIRecords;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/db/entity/AIRecords;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "mAIRecords"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mRecordsDao:Lcom/sma/smartv3/db/dao/AIRecordsDao;

    invoke-interface {v0, p1}, Lcom/sma/smartv3/db/dao/AIRecordsDao;->insert(Lcom/sma/smartv3/db/entity/AIRecords;)J

    return-void
.end method

.method public final addSendRecord(Ljava/lang/String;)V
    .locals 23
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    move-object/from16 v0, p0

    const-string v1, "text"

    move-object/from16 v9, p1

    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v2, Lcom/sma/smartv3/db/entity/AIRecords;

    iget-object v1, v0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mAIFunction:Lcom/sma/smartv3/model/AIFunction;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AIFunction;->getType()Lcom/sma/smartv3/model/AIFunctionType;

    move-result-object v1

    invoke-virtual {v1}, Lcom/sma/smartv3/model/AIFunctionType;->getType()I

    move-result v7

    const v21, 0x1ffc7

    const/16 v22, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x1

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v2 .. v22}, Lcom/sma/smartv3/db/entity/AIRecords;-><init>(IJLjava/lang/String;IILjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->addSendRecord(Lcom/sma/smartv3/db/entity/AIRecords;)V

    return-void
.end method

.method public changeAiModel()V
    .locals 0

    return-void
.end method

.method public final dismissLoading()V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iiOIII0I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iiOIII0I;-><init>(Lcom/sma/smartv3/ui/ai/BaseAIActivity;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final getMAIFunction()Lcom/sma/smartv3/model/AIFunction;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mAIFunction:Lcom/sma/smartv3/model/AIFunction;

    return-object v0
.end method

.method public final getMLoadingPopup()Lcom/android/mltcode/paycertificationapi/uq;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    return-object v0
.end method

.method public final getMReceivedRecords()Lcom/sma/smartv3/db/entity/AIRecords;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mReceivedRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    return-object v0
.end method

.method public final getMRecordsDao()Lcom/sma/smartv3/db/dao/AIRecordsDao;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mRecordsDao:Lcom/sma/smartv3/db/dao/AIRecordsDao;

    return-object v0
.end method

.method public final getOpenAIDeductionPoints()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->openAIDeductionPoints:I

    return v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg3()Ljava/io/Serializable;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "intent -> "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg3()Ljava/io/Serializable;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type com.sma.smartv3.model.AIFunction"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/model/AIFunction;

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mAIFunction:Lcom/sma/smartv3/model/AIFunction;

    return-void
.end method

.method public initEvent()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public initView()V
    .locals 2

    invoke-direct {p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->getDeductionConfig()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mAIFunction:Lcom/sma/smartv3/model/AIFunction;

    if-eqz v0, :cond_0

    const v1, 0x7f0a0023

    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lcom/sma/smartv3/model/AIFunction;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-void
.end method

.method public final isPlayResult()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->isPlayResult:Z

    return v0
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    sget-object v0, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    invoke-virtual {v0}, Lcom/sma/smartv3/biz/AIManager;->XO0X10iO()V

    return-void
.end method

.method public final onSetModel()V
    .locals 7

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mModleSetPopup:Lcom/android/mltcode/paycertificationapi/dj4;

    if-nez v0, :cond_0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/dj4;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/high16 v3, 0x7f030000

    const/4 v4, 0x0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lcom/android/mltcode/paycertificationapi/dj4;-><init>(Landroid/app/Activity;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v0, 0x7f1410ac

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/dj4;->iX(I)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IIO10O1I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IIO10O1I;-><init>(Lcom/sma/smartv3/ui/ai/BaseAIActivity;)V

    invoke-virtual {v1, v0}, Lcom/android/mltcode/paycertificationapi/dj4;->i010I(Lkotlin/jvm/functions/Function1;)V

    iput-object v1, v2, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mModleSetPopup:Lcom/android/mltcode/paycertificationapi/dj4;

    goto :goto_0

    :cond_0
    move-object v2, p0

    :goto_0
    iget-object v0, v2, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mModleSetPopup:Lcom/android/mltcode/paycertificationapi/dj4;

    if-eqz v0, :cond_1

    sget-object v1, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static {v1, v5, v3, v4}, Lcom/sma/smartv3/biz/AIManager;->XXI(Lcom/sma/smartv3/biz/AIManager;ZILjava/lang/Object;)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/dj4;->II1Xi0(I)V

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    return-void
.end method

.method public final onShowEvaluationStatus(Ljava/lang/Object;)V
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "AI_SUPPORT_COMMENT"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/sma/smartv3/model/EvaluationKt;->isShowEvaluationDialog()Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/i72;->iOIi00Ii()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mEvaluationPopup:Lcom/android/mltcode/paycertificationapi/I0iiIOX;

    if-nez p1, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/I0iiIOX;

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {p1, p0, v2, v0, v1}, Lcom/android/mltcode/paycertificationapi/I0iiIOX;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mEvaluationPopup:Lcom/android/mltcode/paycertificationapi/I0iiIOX;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mEvaluationPopup:Lcom/android/mltcode/paycertificationapi/I0iiIOX;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mEvaluationPopup:Lcom/android/mltcode/paycertificationapi/I0iiIOX;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_2
    return-void
.end method

.method public final onTitleLeftClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method public final send(Lcom/sma/smartv3/model/AIQuestion;Lcom/sma/smartv3/ui/ai/BaseAIActivity$OXO1;ZZZ)V
    .locals 9
    .param p1    # Lcom/sma/smartv3/model/AIQuestion;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/sma/smartv3/ui/ai/BaseAIActivity$OXO1;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/model/AIQuestion;",
            "Lcom/sma/smartv3/ui/ai/BaseAIActivity$OXO1<",
            "Lcom/sma/smartv3/model/AIAnswer;",
            ">;ZZZ)V"
        }
    .end annotation

    const-string v0, "question"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mAIAnswerCallback:Lcom/sma/smartv3/ui/ai/BaseAIActivity$OXO1;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "send question = "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lcom/blankj/utilcode/util/LogUtils;->d([Ljava/lang/Object;)V

    sget-object v0, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    new-instance v2, Lcom/sma/smartv3/ui/ai/BaseAIActivity$send$1;

    invoke-direct {v2, p4, p0}, Lcom/sma/smartv3/ui/ai/BaseAIActivity$send$1;-><init>(ZLcom/sma/smartv3/ui/ai/BaseAIActivity;)V

    const/16 v7, 0x30

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p1

    move v3, p3

    move v4, p5

    invoke-static/range {v0 .. v8}, Lcom/sma/smartv3/biz/AIManager;->iXiX011(Lcom/sma/smartv3/biz/AIManager;Lcom/sma/smartv3/model/AIQuestion;Lcom/android/mltcode/paycertificationapi/O1XIiIO;ZZIIILjava/lang/Object;)V

    return-void
.end method

.method public final setMAIFunction(Lcom/sma/smartv3/model/AIFunction;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/model/AIFunction;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mAIFunction:Lcom/sma/smartv3/model/AIFunction;

    return-void
.end method

.method public final setMLoadingPopup(Lcom/android/mltcode/paycertificationapi/uq;)V
    .locals 0
    .param p1    # Lcom/android/mltcode/paycertificationapi/uq;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mLoadingPopup:Lcom/android/mltcode/paycertificationapi/uq;

    return-void
.end method

.method public final setMReceivedRecords(Lcom/sma/smartv3/db/entity/AIRecords;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/db/entity/AIRecords;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mReceivedRecords:Lcom/sma/smartv3/db/entity/AIRecords;

    return-void
.end method

.method public final setOpenAIDeductionPoints(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->openAIDeductionPoints:I

    return-void
.end method

.method public final setPlayResult(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->isPlayResult:Z

    return-void
.end method

.method public showAIDeductionPoints()V
    .locals 0

    return-void
.end method

.method public final showLoading(Z)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iIi0i0IX;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/iIi0i0IX;-><init>(Lcom/sma/smartv3/ui/ai/BaseAIActivity;Z)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final showPayTipPopup(I)V
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mPayTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/go0;

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x0

    invoke-direct {v0, p0, v2, v3, v4}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v2, 0x7f141348

    invoke-virtual {v0, v2}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/go0;->iX(Ljava/lang/Integer;)V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/android/mltcode/paycertificationapi/go0;->IXXOO(Ljava/lang/Integer;)V

    const p1, 0x7f14027f

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {v0, p1, v4, v3, v4}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance p1, Lcom/android/mltcode/paycertificationapi/XiXOiIOXX;

    invoke-direct {p1, p0}, Lcom/android/mltcode/paycertificationapi/XiXOiIOXX;-><init>(Lcom/sma/smartv3/ui/ai/BaseAIActivity;)V

    const v2, 0x7f140c30

    invoke-virtual {v0, v2, p1}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mPayTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mPayTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result p1

    if-ne p1, v1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lcom/sma/smartv3/ui/ai/BaseAIActivity;->mPayTipPopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_2
    return-void
.end method

.method public final stopPlayer(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "AI_Answer_stop_player"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/sma/smartv3/biz/AIManager;->OXO1:Lcom/sma/smartv3/biz/AIManager;

    invoke-virtual {p1}, Lcom/sma/smartv3/biz/AIManager;->Ii0X0X()V

    return-void
.end method
