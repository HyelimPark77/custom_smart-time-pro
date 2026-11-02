.class public final Lcom/sma/smartv3/ui/me/CoachingsActivity;
.super Lcom/bestmafen/androidbase/list/BaseListActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/list/BaseListActivity<",
        "Lcom/szabh/smable3/entity/BleCoaching;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCoachingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoachingsActivity.kt\ncom/sma/smartv3/ui/me/CoachingsActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,327:1\n18#2,2:328\n15#2:330\n11#2,2:331\n173#3,7:333\n180#3,3:341\n143#3,7:344\n183#3:351\n1#4:340\n85#5,18:352\n*S KotlinDebug\n*F\n+ 1 CoachingsActivity.kt\ncom/sma/smartv3/ui/me/CoachingsActivity\n*L\n150#1:328,2\n150#1:330\n177#1:331,2\n178#1:333,7\n178#1:341,3\n178#1:344,7\n178#1:351\n178#1:340\n131#1:352,18\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCoachingsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoachingsActivity.kt\ncom/sma/smartv3/ui/me/CoachingsActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,327:1\n18#2,2:328\n15#2:330\n11#2,2:331\n173#3,7:333\n180#3,3:341\n143#3,7:344\n183#3:351\n1#4:340\n85#5,18:352\n*S KotlinDebug\n*F\n+ 1 CoachingsActivity.kt\ncom/sma/smartv3/ui/me/CoachingsActivity\n*L\n150#1:328,2\n150#1:330\n177#1:331,2\n178#1:333,7\n178#1:341,3\n178#1:344,7\n178#1:351\n178#1:340\n131#1:352,18\n*E\n"
    }
.end annotation


# instance fields
.field private final btnBottom$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/me/CoachingsActivity$XIi00iiXO;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mCoachingIds:Lcom/szabh/smable3/entity/BleCoachingIds;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mDeletePopup:Lcom/android/mltcode/paycertificationapi/go0;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mIndex:I


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iiXIOIXi0;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iiXIOIXi0;-><init>(Lcom/sma/smartv3/ui/me/CoachingsActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingsActivity;->btnBottom$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/sma/smartv3/ui/me/CoachingsActivity$XIi00iiXO;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/me/CoachingsActivity$XIi00iiXO;-><init>(Lcom/sma/smartv3/ui/me/CoachingsActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingsActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/CoachingsActivity$XIi00iiXO;

    new-instance v0, Lcom/szabh/smable3/entity/BleCoachingIds;

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-direct {v0, v3, v1, v2, v1}, Lcom/szabh/smable3/entity/BleCoachingIds;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingsActivity;->mCoachingIds:Lcom/szabh/smable3/entity/BleCoachingIds;

    const/4 v0, -0x1

    iput v0, p0, Lcom/sma/smartv3/ui/me/CoachingsActivity;->mIndex:I

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/me/CoachingsActivity;ILcom/android/mltcode/paycertificationapi/fi5;I)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/me/CoachingsActivity;->initView$lambda$0$1(Lcom/sma/smartv3/ui/me/CoachingsActivity;ILcom/android/mltcode/paycertificationapi/fi5;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/me/CoachingsActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/CoachingsActivity;->btnBottom_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingsActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Landroid/widget/ImageView;Lcom/sma/smartv3/ui/me/CoachingsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/me/CoachingsActivity;->initItem$lambda$0$0$0(Landroid/widget/ImageView;Lcom/sma/smartv3/ui/me/CoachingsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/me/CoachingsActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/me/CoachingsActivity;->initView$lambda$0$1$0$0(Lcom/sma/smartv3/ui/me/CoachingsActivity;)Z

    move-result p0

    return p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/me/CoachingsActivity;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/me/CoachingsActivity;->initView$lambda$1(Lcom/sma/smartv3/ui/me/CoachingsActivity;Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    return-void
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/me/CoachingsActivity;Lcom/android/mltcode/paycertificationapi/fi5;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/me/CoachingsActivity;->initView$lambda$0$0(Lcom/sma/smartv3/ui/me/CoachingsActivity;Lcom/android/mltcode/paycertificationapi/fi5;)V

    return-void
.end method

.method public static synthetic XXI(ZLandroid/widget/ImageView;Lcom/sma/smartv3/ui/me/CoachingsActivity;ILandroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/me/CoachingsActivity;->initItem$lambda$0$0(ZLandroid/widget/ImageView;Lcom/sma/smartv3/ui/me/CoachingsActivity;ILandroid/view/View;)V

    return-void
.end method

.method public static final synthetic access$getMCoachingIds$p(Lcom/sma/smartv3/ui/me/CoachingsActivity;)Lcom/szabh/smable3/entity/BleCoachingIds;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/me/CoachingsActivity;->mCoachingIds:Lcom/szabh/smable3/entity/BleCoachingIds;

    return-object p0
.end method

.method public static final synthetic access$getMList(Lcom/sma/smartv3/ui/me/CoachingsActivity;)Ljava/util/List;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMListAdapter(Lcom/sma/smartv3/ui/me/CoachingsActivity;)Lcom/android/mltcode/paycertificationapi/XII0Oi10O;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setMCoachingIds$p(Lcom/sma/smartv3/ui/me/CoachingsActivity;Lcom/szabh/smable3/entity/BleCoachingIds;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/CoachingsActivity;->mCoachingIds:Lcom/szabh/smable3/entity/BleCoachingIds;

    return-void
.end method

.method private static final btnBottom_delegate$lambda$0(Lcom/sma/smartv3/ui/me/CoachingsActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a01b9

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final checkCount()V
    .locals 3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingsActivity;->getBtnBottom()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sget-object v2, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/q62;->IO0II0i()I

    move-result v2

    if-ge v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method private final getBtnBottom()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingsActivity;->btnBottom$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private static final initItem$lambda$0$0(ZLandroid/widget/ImageView;Lcom/sma/smartv3/ui/me/CoachingsActivity;ILandroid/view/View;)V
    .locals 0

    if-nez p0, :cond_0

    new-instance p0, Lcom/android/mltcode/paycertificationapi/XX10;

    invoke-direct {p0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/XX10;-><init>(Landroid/widget/ImageView;Lcom/sma/smartv3/ui/me/CoachingsActivity;I)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    const/4 p3, 0x0

    invoke-static {p3, p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method private static final initItem$lambda$0$0$0(Landroid/widget/ImageView;Lcom/sma/smartv3/ui/me/CoachingsActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 8

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    invoke-virtual {p0, p3}, Landroid/view/View;->setEnabled(Z)V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->COACHING:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->CREATE:Lcom/szabh/smable3/BleKeyFlag;

    invoke-virtual {p1}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    move-object v3, p3

    check-cast v3, Lcom/bestmafen/baseble/data/BleBuffer;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    const/4 p3, 0x2

    new-array p3, p3, [F

    fill-array-data p3, :array_0

    const-string v0, "rotation"

    invoke-static {p0, v0, p3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object p3

    const-wide/16 v0, 0x258

    invoke-virtual {p3, v0, v1}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    new-instance v0, Lcom/sma/smartv3/ui/me/CoachingsActivity$OXO1;

    invoke-direct {v0, p0, p1, p2}, Lcom/sma/smartv3/ui/me/CoachingsActivity$OXO1;-><init>(Landroid/widget/ImageView;Lcom/sma/smartv3/ui/me/CoachingsActivity;I)V

    invoke-virtual {p3, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    invoke-virtual {p3}, Landroid/animation/ObjectAnimator;->start()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0

    nop

    :array_0
    .array-data 4
        0x0
        0x43b40000    # 360.0f
    .end array-data
.end method

.method private static final initView$lambda$0$0(Lcom/sma/smartv3/ui/me/CoachingsActivity;Lcom/android/mltcode/paycertificationapi/fi5;)V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/ji5;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/ji5;-><init>(Landroid/content/Context;)V

    const/high16 p0, 0x42900000    # 72.0f

    invoke-static {p0}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result p0

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/ji5;->I1XOi1(I)V

    const p0, 0x7f080ffe

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/ji5;->IO(I)V

    const p0, 0x7f080fad

    invoke-virtual {v0, p0}, Lcom/android/mltcode/paycertificationapi/ji5;->I0IIOi(I)V

    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/fi5;->OXO1(Lcom/android/mltcode/paycertificationapi/ji5;)V

    return-void
.end method

.method private static final initView$lambda$0$1(Lcom/sma/smartv3/ui/me/CoachingsActivity;ILcom/android/mltcode/paycertificationapi/fi5;I)Z
    .locals 2

    iput p1, p0, Lcom/sma/smartv3/ui/me/CoachingsActivity;->mIndex:I

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/CoachingsActivity;->mDeletePopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-nez p1, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/go0;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p2

    const/4 p3, 0x0

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p1, p2, p3, v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;-><init>(Landroid/app/Activity;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const p2, 0x7f1403e1

    invoke-virtual {p1, p2}, Lcom/android/mltcode/paycertificationapi/go0;->O1O(I)V

    const p2, 0x7f14027f

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1, p2, v1, v0, v1}, Lcom/android/mltcode/paycertificationapi/go0;->X11iII1O1(Lcom/android/mltcode/paycertificationapi/go0;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    new-instance p2, Lcom/android/mltcode/paycertificationapi/OX0O0OIi1;

    invoke-direct {p2, p0}, Lcom/android/mltcode/paycertificationapi/OX0O0OIi1;-><init>(Lcom/sma/smartv3/ui/me/CoachingsActivity;)V

    const p3, 0x7f14034b

    invoke-virtual {p1, p3, p2}, Lcom/android/mltcode/paycertificationapi/go0;->X1IX(ILkotlin/jvm/functions/Function0;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/me/CoachingsActivity;->mDeletePopup:Lcom/android/mltcode/paycertificationapi/go0;

    :cond_0
    iget-object p0, p0, Lcom/sma/smartv3/ui/me/CoachingsActivity;->mDeletePopup:Lcom/android/mltcode/paycertificationapi/go0;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/android/mltcode/paycertificationapi/OIXIOIO;->IIX1OXO()V

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method private static final initView$lambda$0$1$0$0(Lcom/sma/smartv3/ui/me/CoachingsActivity;)Z
    .locals 7

    iget-object v0, p0, Lcom/sma/smartv3/ui/me/CoachingsActivity;->mCoachingIds:Lcom/szabh/smable3/entity/BleCoachingIds;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleCoachingIds;->getMIds()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v1

    iget v2, p0, Lcom/sma/smartv3/ui/me/CoachingsActivity;->mIndex:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/szabh/smable3/entity/BleCoaching;

    invoke-virtual {v1}, Lcom/szabh/smable3/entity/BleIdObject;->getMId()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    iget v1, p0, Lcom/sma/smartv3/ui/me/CoachingsActivity;->mIndex:I

    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v2, Lcom/szabh/smable3/BleKey;->COACHING:Lcom/szabh/smable3/BleKey;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/szabh/smable3/component/BaseBleCache;->putList$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/util/List;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingsActivity;->checkCount()V

    const/4 p0, 0x1

    return p0
.end method

.method private static final initView$lambda$1(Lcom/sma/smartv3/ui/me/CoachingsActivity;Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    invoke-direct {p0, p3}, Lcom/sma/smartv3/ui/me/CoachingsActivity;->toEdit(I)V

    return-void
.end method

.method private final newCoaching()Lcom/szabh/smable3/entity/BleCoaching;
    .locals 17

    new-instance v0, Lcom/szabh/smable3/entity/BleCoaching;

    new-instance v1, Lcom/szabh/smable3/entity/BleCoachingSegment;

    sget-object v8, Lcom/szabh/smable3/entity/CompletionCondition;->DURATION:Lcom/szabh/smable3/entity/CompletionCondition;

    invoke-virtual {v8}, Lcom/szabh/smable3/entity/CompletionCondition;->getCondition()I

    move-result v2

    sget-object v3, Lcom/szabh/smable3/entity/SegmentActivity;->WARM_UP:Lcom/szabh/smable3/entity/SegmentActivity;

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/SegmentActivity;->getActivity()I

    move-result v4

    sget-object v3, Lcom/szabh/smable3/entity/Stage;->WARM_UP:Lcom/szabh/smable3/entity/Stage;

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/Stage;->getStage()I

    move-result v5

    const/16 v6, 0x1e

    const/4 v7, 0x0

    const-string v3, ""

    invoke-direct/range {v1 .. v7}, Lcom/szabh/smable3/entity/BleCoachingSegment;-><init>(ILjava/lang/String;IIII)V

    new-instance v9, Lcom/szabh/smable3/entity/BleCoachingSegment;

    invoke-virtual {v8}, Lcom/szabh/smable3/entity/CompletionCondition;->getCondition()I

    move-result v10

    sget-object v2, Lcom/szabh/smable3/entity/SegmentActivity;->RUN:Lcom/szabh/smable3/entity/SegmentActivity;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/SegmentActivity;->getActivity()I

    move-result v12

    sget-object v2, Lcom/szabh/smable3/entity/Stage;->GO_FOR:Lcom/szabh/smable3/entity/Stage;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/Stage;->getStage()I

    move-result v13

    const/16 v14, 0x1e

    const/4 v15, 0x0

    const-string v11, ""

    invoke-direct/range {v9 .. v15}, Lcom/szabh/smable3/entity/BleCoachingSegment;-><init>(ILjava/lang/String;IIII)V

    new-instance v10, Lcom/szabh/smable3/entity/BleCoachingSegment;

    invoke-virtual {v8}, Lcom/szabh/smable3/entity/CompletionCondition;->getCondition()I

    move-result v11

    sget-object v2, Lcom/szabh/smable3/entity/SegmentActivity;->WALK:Lcom/szabh/smable3/entity/SegmentActivity;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/SegmentActivity;->getActivity()I

    move-result v13

    sget-object v2, Lcom/szabh/smable3/entity/Stage;->COOL_DOWN:Lcom/szabh/smable3/entity/Stage;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/Stage;->getStage()I

    move-result v14

    const/16 v15, 0x1e

    const/16 v16, 0x0

    const-string v12, ""

    invoke-direct/range {v10 .. v16}, Lcom/szabh/smable3/entity/BleCoachingSegment;-><init>(ILjava/lang/String;IIII)V

    filled-new-array {v1, v9, v10}, [Lcom/szabh/smable3/entity/BleCoachingSegment;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v2, ""

    const/4 v3, 0x1

    invoke-direct {v0, v2, v2, v3, v1}, Lcom/szabh/smable3/entity/BleCoaching;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V

    return-object v0
.end method

.method private final setDefaultCoaching()Ljava/util/List;
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleCoaching;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    new-instance v1, Lcom/szabh/smable3/entity/BleCoaching;

    const v2, 0x7f1411af

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "getString(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, 0x7f1411b0

    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lcom/szabh/smable3/entity/BleCoachingSegment;

    sget-object v12, Lcom/szabh/smable3/entity/CompletionCondition;->DURATION:Lcom/szabh/smable3/entity/CompletionCondition;

    invoke-virtual {v12}, Lcom/szabh/smable3/entity/CompletionCondition;->getCondition()I

    move-result v6

    const v7, 0x7f1411f5

    invoke-virtual {v0, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v8, Lcom/szabh/smable3/entity/SegmentActivity;->RUN:Lcom/szabh/smable3/entity/SegmentActivity;

    invoke-virtual {v8}, Lcom/szabh/smable3/entity/SegmentActivity;->getActivity()I

    move-result v8

    sget-object v13, Lcom/szabh/smable3/entity/Stage;->GO_FOR:Lcom/szabh/smable3/entity/Stage;

    invoke-virtual {v13}, Lcom/szabh/smable3/entity/Stage;->getStage()I

    move-result v9

    const/16 v10, 0x3c

    const/4 v11, 0x0

    invoke-direct/range {v5 .. v11}, Lcom/szabh/smable3/entity/BleCoachingSegment;-><init>(ILjava/lang/String;IIII)V

    new-instance v14, Lcom/szabh/smable3/entity/BleCoachingSegment;

    invoke-virtual {v12}, Lcom/szabh/smable3/entity/CompletionCondition;->getCondition()I

    move-result v15

    const v6, 0x7f141200

    invoke-virtual {v0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v7, Lcom/szabh/smable3/entity/SegmentActivity;->WALK:Lcom/szabh/smable3/entity/SegmentActivity;

    invoke-virtual {v7}, Lcom/szabh/smable3/entity/SegmentActivity;->getActivity()I

    move-result v17

    invoke-virtual {v13}, Lcom/szabh/smable3/entity/Stage;->getStage()I

    move-result v18

    const/16 v19, 0x3c

    const/16 v20, 0x0

    move-object/from16 v16, v6

    invoke-direct/range {v14 .. v20}, Lcom/szabh/smable3/entity/BleCoachingSegment;-><init>(ILjava/lang/String;IIII)V

    filled-new-array {v5, v14}, [Lcom/szabh/smable3/entity/BleCoachingSegment;

    move-result-object v5

    invoke-static {v5}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const/4 v6, 0x3

    invoke-direct {v1, v2, v4, v6, v5}, Lcom/szabh/smable3/entity/BleCoaching;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V

    new-instance v2, Lcom/szabh/smable3/entity/BleCoaching;

    const v4, 0x7f140cf8

    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v5, 0x7f140cf9

    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v14, Lcom/szabh/smable3/entity/BleCoachingSegment;

    sget-object v8, Lcom/szabh/smable3/entity/CompletionCondition;->DURATION_IN_HR_ZONE:Lcom/szabh/smable3/entity/CompletionCondition;

    invoke-virtual {v8}, Lcom/szabh/smable3/entity/CompletionCondition;->getCondition()I

    move-result v15

    const v9, 0x7f140cf6

    invoke-virtual {v0, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v10, Lcom/szabh/smable3/entity/SegmentActivity;->WARM_UP:Lcom/szabh/smable3/entity/SegmentActivity;

    invoke-virtual {v10}, Lcom/szabh/smable3/entity/SegmentActivity;->getActivity()I

    move-result v17

    invoke-virtual {v13}, Lcom/szabh/smable3/entity/Stage;->getStage()I

    move-result v18

    const/16 v19, 0x78

    const/16 v20, 0x1

    move-object/from16 v16, v9

    invoke-direct/range {v14 .. v20}, Lcom/szabh/smable3/entity/BleCoachingSegment;-><init>(ILjava/lang/String;IIII)V

    new-instance v15, Lcom/szabh/smable3/entity/BleCoachingSegment;

    invoke-virtual {v8}, Lcom/szabh/smable3/entity/CompletionCondition;->getCondition()I

    move-result v16

    const v9, 0x7f140cf7

    invoke-virtual {v0, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7}, Lcom/szabh/smable3/entity/SegmentActivity;->getActivity()I

    move-result v18

    invoke-virtual {v13}, Lcom/szabh/smable3/entity/Stage;->getStage()I

    move-result v19

    const/16 v20, 0x3c

    const/16 v21, 0x2

    move-object/from16 v17, v9

    invoke-direct/range {v15 .. v21}, Lcom/szabh/smable3/entity/BleCoachingSegment;-><init>(ILjava/lang/String;IIII)V

    filled-new-array {v14, v15}, [Lcom/szabh/smable3/entity/BleCoachingSegment;

    move-result-object v9

    invoke-static {v9}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    const/4 v10, 0x1

    invoke-direct {v2, v4, v5, v10, v9}, Lcom/szabh/smable3/entity/BleCoaching;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V

    new-instance v4, Lcom/szabh/smable3/entity/BleCoaching;

    const v5, 0x7f141151

    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v9, 0x7f141152

    invoke-virtual {v0, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v14, Lcom/szabh/smable3/entity/BleCoachingSegment;

    invoke-virtual {v12}, Lcom/szabh/smable3/entity/CompletionCondition;->getCondition()I

    move-result v15

    const v10, 0x7f140d5b

    invoke-virtual {v0, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v11, Lcom/szabh/smable3/entity/SegmentActivity;->JUMP_JACKS:Lcom/szabh/smable3/entity/SegmentActivity;

    invoke-virtual {v11}, Lcom/szabh/smable3/entity/SegmentActivity;->getActivity()I

    move-result v17

    sget-object v11, Lcom/szabh/smable3/entity/Stage;->OTHER:Lcom/szabh/smable3/entity/Stage;

    invoke-virtual {v11}, Lcom/szabh/smable3/entity/Stage;->getStage()I

    move-result v18

    const/16 v19, 0x1e

    const/16 v20, 0x0

    move-object/from16 v16, v10

    invoke-direct/range {v14 .. v20}, Lcom/szabh/smable3/entity/BleCoachingSegment;-><init>(ILjava/lang/String;IIII)V

    new-instance v15, Lcom/szabh/smable3/entity/BleCoachingSegment;

    invoke-virtual {v8}, Lcom/szabh/smable3/entity/CompletionCondition;->getCondition()I

    move-result v16

    const v8, 0x7f14119d

    invoke-virtual {v0, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v11, Lcom/szabh/smable3/entity/SegmentActivity;->COOL_DOWN:Lcom/szabh/smable3/entity/SegmentActivity;

    invoke-virtual {v11}, Lcom/szabh/smable3/entity/SegmentActivity;->getActivity()I

    move-result v18

    sget-object v22, Lcom/szabh/smable3/entity/Stage;->RECOVERY:Lcom/szabh/smable3/entity/Stage;

    invoke-virtual/range {v22 .. v22}, Lcom/szabh/smable3/entity/Stage;->getStage()I

    move-result v19

    const/16 v20, 0xa

    const/16 v21, 0x0

    move-object/from16 v17, v10

    invoke-direct/range {v15 .. v21}, Lcom/szabh/smable3/entity/BleCoachingSegment;-><init>(ILjava/lang/String;IIII)V

    new-instance v16, Lcom/szabh/smable3/entity/BleCoachingSegment;

    sget-object v10, Lcom/szabh/smable3/entity/CompletionCondition;->MANUAL:Lcom/szabh/smable3/entity/CompletionCondition;

    invoke-virtual {v10}, Lcom/szabh/smable3/entity/CompletionCondition;->getCondition()I

    move-result v24

    const v6, 0x7f14113c

    invoke-virtual {v0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v17, Lcom/szabh/smable3/entity/SegmentActivity;->PUSH_UP:Lcom/szabh/smable3/entity/SegmentActivity;

    invoke-virtual/range {v17 .. v17}, Lcom/szabh/smable3/entity/SegmentActivity;->getActivity()I

    move-result v26

    invoke-virtual {v13}, Lcom/szabh/smable3/entity/Stage;->getStage()I

    move-result v27

    const/16 v28, 0xa

    const/16 v29, 0x0

    move-object/from16 v25, v6

    move-object/from16 v23, v16

    invoke-direct/range {v23 .. v29}, Lcom/szabh/smable3/entity/BleCoachingSegment;-><init>(ILjava/lang/String;IIII)V

    new-instance v17, Lcom/szabh/smable3/entity/BleCoachingSegment;

    invoke-virtual {v12}, Lcom/szabh/smable3/entity/CompletionCondition;->getCondition()I

    move-result v24

    invoke-virtual {v0, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7}, Lcom/szabh/smable3/entity/SegmentActivity;->getActivity()I

    move-result v26

    invoke-virtual/range {v22 .. v22}, Lcom/szabh/smable3/entity/Stage;->getStage()I

    move-result v27

    move-object/from16 v25, v6

    move-object/from16 v23, v17

    invoke-direct/range {v23 .. v29}, Lcom/szabh/smable3/entity/BleCoachingSegment;-><init>(ILjava/lang/String;IIII)V

    new-instance v18, Lcom/szabh/smable3/entity/BleCoachingSegment;

    invoke-virtual {v10}, Lcom/szabh/smable3/entity/CompletionCondition;->getCondition()I

    move-result v24

    const v6, 0x7f1411f9

    invoke-virtual {v0, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v7, Lcom/szabh/smable3/entity/SegmentActivity;->SIT_UP:Lcom/szabh/smable3/entity/SegmentActivity;

    invoke-virtual {v7}, Lcom/szabh/smable3/entity/SegmentActivity;->getActivity()I

    move-result v26

    invoke-virtual {v13}, Lcom/szabh/smable3/entity/Stage;->getStage()I

    move-result v27

    move-object/from16 v25, v6

    move-object/from16 v23, v18

    invoke-direct/range {v23 .. v29}, Lcom/szabh/smable3/entity/BleCoachingSegment;-><init>(ILjava/lang/String;IIII)V

    new-instance v19, Lcom/szabh/smable3/entity/BleCoachingSegment;

    invoke-virtual {v10}, Lcom/szabh/smable3/entity/CompletionCondition;->getCondition()I

    move-result v24

    invoke-virtual {v0, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v11}, Lcom/szabh/smable3/entity/SegmentActivity;->getActivity()I

    move-result v26

    invoke-virtual/range {v22 .. v22}, Lcom/szabh/smable3/entity/Stage;->getStage()I

    move-result v27

    move-object/from16 v25, v6

    move-object/from16 v23, v19

    invoke-direct/range {v23 .. v29}, Lcom/szabh/smable3/entity/BleCoachingSegment;-><init>(ILjava/lang/String;IIII)V

    filled-new-array/range {v14 .. v19}, [Lcom/szabh/smable3/entity/BleCoachingSegment;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const/4 v6, 0x3

    invoke-direct {v4, v5, v9, v6, v3}, Lcom/szabh/smable3/entity/BleCoaching;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V

    filled-new-array {v1, v2, v4}, [Lcom/szabh/smable3/entity/BleCoaching;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->Ii1iii0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    return-object v1
.end method

.method private final toEdit(I)V
    .locals 3

    iput p1, p0, Lcom/sma/smartv3/ui/me/CoachingsActivity;->mIndex:I

    if-gez p1, :cond_0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingsActivity;->newCoaching()Lcom/szabh/smable3/entity/BleCoaching;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/szabh/smable3/entity/BleCoaching;

    :goto_0
    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->XO0O10()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-class v1, Lcom/szabh/smable3/entity/BleCoaching;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/gson/Gson;

    invoke-direct {v2}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v2, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/blankj/utilcode/util/SPUtils;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget p1, p0, Lcom/sma/smartv3/ui/me/CoachingsActivity;->mIndex:I

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "mArg0"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "mArg1"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string p1, "mArg2"

    invoke-virtual {v0, p1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string p1, "mArg3"

    invoke-virtual {v0, p1, v2}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    new-instance p1, Landroid/content/Intent;

    const-class v1, Lcom/sma/smartv3/ui/me/CoachingEditActivity;

    invoke-direct {p1, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 8
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/CoachingsActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/CoachingsActivity$XIi00iiXO;

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    sget-object v1, Lcom/szabh/smable3/BleKey;->COACHING:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->READ:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/16 v3, 0xff

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt8$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZILjava/lang/Object;)Z

    return-void
.end method

.method public initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/szabh/smable3/entity/BleCoaching;I)V
    .locals 2
    .param p1    # Lcom/android/mltcode/paycertificationapi/ug6;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/szabh/smable3/entity/BleCoaching;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p2, p0, Lcom/sma/smartv3/ui/me/CoachingsActivity;->mCoachingIds:Lcom/szabh/smable3/entity/BleCoachingIds;

    invoke-virtual {p2}, Lcom/szabh/smable3/entity/BleCoachingIds;->getMIds()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/szabh/smable3/entity/BleCoaching;

    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleIdObject;->getMId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p2

    const v0, 0x7f0a0670

    .line 3
    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/ug6;->O00(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    if-eqz p2, :cond_0

    const v1, 0x7f080ffb

    goto :goto_0

    :cond_0
    const v1, 0x7f080ff9

    .line 4
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 5
    new-instance v1, Lcom/android/mltcode/paycertificationapi/OXii1Xi;

    invoke-direct {v1, p2, v0, p0, p3}, Lcom/android/mltcode/paycertificationapi/OXii1Xi;-><init>(ZLandroid/widget/ImageView;Lcom/sma/smartv3/ui/me/CoachingsActivity;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 6
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/szabh/smable3/entity/BleCoaching;

    invoke-virtual {p2}, Lcom/szabh/smable3/entity/BleCoaching;->getMTitle()Ljava/lang/String;

    move-result-object p2

    const v0, 0x7f0a1897

    invoke-virtual {p1, v0, p2}, Lcom/android/mltcode/paycertificationapi/ug6;->OII(ILjava/lang/String;)Lcom/android/mltcode/paycertificationapi/ug6;

    .line 7
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/szabh/smable3/entity/BleCoaching;

    invoke-virtual {p2}, Lcom/szabh/smable3/entity/BleCoaching;->getMDescription()Ljava/lang/String;

    move-result-object p2

    const p3, 0x7f0a0c68

    invoke-virtual {p1, p3, p2}, Lcom/android/mltcode/paycertificationapi/ug6;->OII(ILjava/lang/String;)Lcom/android/mltcode/paycertificationapi/ug6;

    return-void
.end method

.method public bridge synthetic initItem(Lcom/android/mltcode/paycertificationapi/ug6;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/szabh/smable3/entity/BleCoaching;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/me/CoachingsActivity;->initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/szabh/smable3/entity/BleCoaching;I)V

    return-void
.end method

.method public initList()Ljava/util/List;
    .locals 6
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleCoaching;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v1, Lcom/szabh/smable3/BleKey;->COACHING:Lcom/szabh/smable3/BleKey;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-class v2, Lcom/szabh/smable3/entity/BleCoaching;

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/szabh/smable3/component/BaseBleCache;->getList$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_0

    return-object v0

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingsActivity;->setDefaultCoaching()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public initView()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->initView()V

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    const v1, 0x7f140b5f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListView()Landroid/widget/ListView;

    move-result-object v0

    const v1, 0x7f0a035b

    invoke-virtual {p0, v1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setEmptyView(Landroid/view/View;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListView()Landroid/widget/ListView;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.baoyz.swipemenulistview.SwipeMenuListView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->X1ii(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/baoyz/swipemenulistview/SwipeMenuListView;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/O11X1OX1;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/O11X1OX1;-><init>(Lcom/sma/smartv3/ui/me/CoachingsActivity;)V

    invoke-virtual {v0, v1}, Lcom/baoyz/swipemenulistview/SwipeMenuListView;->setMenuCreator(Lcom/android/mltcode/paycertificationapi/hi5;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/iII00O1Oi;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/iII00O1Oi;-><init>(Lcom/sma/smartv3/ui/me/CoachingsActivity;)V

    invoke-virtual {v0, v1}, Lcom/baoyz/swipemenulistview/SwipeMenuListView;->setOnMenuItemClickListener(Lcom/baoyz/swipemenulistview/SwipeMenuListView$XIi00iiXO;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListView()Landroid/widget/ListView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/XII111;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/XII111;-><init>(Lcom/sma/smartv3/ui/me/CoachingsActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingsActivity;->checkCount()V

    return-void
.end method

.method public itemLayoutId()I
    .locals 1

    const v0, 0x7f0d0ecd

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d004b

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 8
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/4 p1, -0x1

    if-ne p2, p1, :cond_2

    sget-object p1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/a01;->XO0O10()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object p1

    new-instance p2, Lcom/google/gson/Gson;

    invoke-direct {p2}, Lcom/google/gson/Gson;-><init>()V

    const-class p3, Lcom/szabh/smable3/entity/BleCoaching;

    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1, p3}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-virtual {p3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p1

    :cond_0
    move-object v3, p1

    check-cast v3, Lcom/szabh/smable3/entity/BleCoaching;

    iget p1, p0, Lcom/sma/smartv3/ui/me/CoachingsActivity;->mIndex:I

    if-gez p1, :cond_1

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->COACHING:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->CREATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/me/CoachingsActivity;->mCoachingIds:Lcom/szabh/smable3/entity/BleCoachingIds;

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleCoachingIds;->getMIds()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleIdObject;->getMId()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->COACHING:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->UPDATE:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    :goto_0
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->clear()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p1

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v1, Lcom/szabh/smable3/BleKey;->COACHING:Lcom/szabh/smable3/BleKey;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-class v2, Lcom/szabh/smable3/entity/BleCoaching;

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/szabh/smable3/component/BaseBleCache;->getList$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/me/CoachingsActivity;->checkCount()V

    :cond_2
    return-void
.end method

.method public final onBottomClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, -0x1

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/me/CoachingsActivity;->toEdit(I)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/me/CoachingsActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/me/CoachingsActivity$XIi00iiXO;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

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
