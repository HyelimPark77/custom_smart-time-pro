.class public final Lcom/sma/smartv3/ui/device/WorldClockActivity;
.super Lcom/bestmafen/androidbase/list/BaseListActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/list/BaseListActivity<",
        "Lcom/szabh/smable3/entity/BleWorldClock;",
        ">;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nWorldClockActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorldClockActivity.kt\ncom/sma/smartv3/ui/device/WorldClockActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,267:1\n1#2:268\n1563#3:269\n1634#3,3:270\n1869#3,2:273\n*S KotlinDebug\n*F\n+ 1 WorldClockActivity.kt\ncom/sma/smartv3/ui/device/WorldClockActivity\n*L\n242#1:269\n242#1:270,3\n208#1:273,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWorldClockActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorldClockActivity.kt\ncom/sma/smartv3/ui/device/WorldClockActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,267:1\n1#2:268\n1563#3:269\n1634#3,3:270\n1869#3,2:273\n*S KotlinDebug\n*F\n+ 1 WorldClockActivity.kt\ncom/sma/smartv3/ui/device/WorldClockActivity\n*L\n242#1:269\n242#1:270,3\n208#1:273,2\n*E\n"
    }
.end annotation


# instance fields
.field private final DIFF:I

.field private final MAX:I

.field private final btnBottom$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mBleHandleCallback:Lcom/sma/smartv3/ui/device/WorldClockActivity$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private mLocalWorldClock:Lcom/szabh/smable3/entity/BleWorldClock;

.field private final mtvLocalName$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final mtvLocalTime$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final tvTip$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/f67;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/f67;-><init>(Lcom/sma/smartv3/ui/device/WorldClockActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/WorldClockActivity;->tvTip$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/g67;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/g67;-><init>(Lcom/sma/smartv3/ui/device/WorldClockActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/WorldClockActivity;->btnBottom$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/h67;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/h67;-><init>(Lcom/sma/smartv3/ui/device/WorldClockActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/WorldClockActivity;->mtvLocalTime$delegate:Lkotlin/Lazy;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i67;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/i67;-><init>(Lcom/sma/smartv3/ui/device/WorldClockActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/WorldClockActivity;->mtvLocalName$delegate:Lkotlin/Lazy;

    const v0, 0xdbba0

    iput v0, p0, Lcom/sma/smartv3/ui/device/WorldClockActivity;->DIFF:I

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->XOO0Xi()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/sma/smartv3/ui/device/WorldClockActivity;->MAX:I

    new-instance v0, Lcom/sma/smartv3/ui/device/WorldClockActivity$OXO1;

    invoke-direct {v0, p0}, Lcom/sma/smartv3/ui/device/WorldClockActivity$OXO1;-><init>(Lcom/sma/smartv3/ui/device/WorldClockActivity;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/WorldClockActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/WorldClockActivity$OXO1;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/device/WorldClockActivity;)Lcom/sma/smartv3/view/MyDigitalClock;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/WorldClockActivity;->mtvLocalTime_delegate$lambda$0(Lcom/sma/smartv3/ui/device/WorldClockActivity;)Lcom/sma/smartv3/view/MyDigitalClock;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/device/WorldClockActivity;ILcom/android/mltcode/paycertificationapi/fi5;I)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/WorldClockActivity;->initView$lambda$0$1(Lcom/sma/smartv3/ui/device/WorldClockActivity;ILcom/android/mltcode/paycertificationapi/fi5;I)Z

    move-result p0

    return p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/device/WorldClockActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/WorldClockActivity;->tvTip_delegate$lambda$0(Lcom/sma/smartv3/ui/device/WorldClockActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/device/WorldClockActivity;Lcom/android/mltcode/paycertificationapi/fi5;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/device/WorldClockActivity;->initView$lambda$0$0(Lcom/sma/smartv3/ui/device/WorldClockActivity;Lcom/android/mltcode/paycertificationapi/fi5;)V

    return-void
.end method

.method public static synthetic OIX0iXi(Lcom/sma/smartv3/ui/device/WorldClockActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/WorldClockActivity;->mtvLocalName_delegate$lambda$0(Lcom/sma/smartv3/ui/device/WorldClockActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/device/WorldClockActivity;)Landroid/view/View;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/device/WorldClockActivity;->btnBottom_delegate$lambda$0(Lcom/sma/smartv3/ui/device/WorldClockActivity;)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/device/WorldClockActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/WorldClockActivity;->initView$lambda$0$1$0(Lcom/sma/smartv3/ui/device/WorldClockActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Landroid/content/Intent;Lcom/sma/smartv3/ui/device/WorldClockActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/device/WorldClockActivity;->onActivityResult$lambda$0(Landroid/content/Intent;Lcom/sma/smartv3/ui/device/WorldClockActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$checkCount(Lcom/sma/smartv3/ui/device/WorldClockActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WorldClockActivity;->checkCount()V

    return-void
.end method

.method public static final synthetic access$getDIFF$p(Lcom/sma/smartv3/ui/device/WorldClockActivity;)I
    .locals 0

    iget p0, p0, Lcom/sma/smartv3/ui/device/WorldClockActivity;->DIFF:I

    return p0
.end method

.method public static final synthetic access$getMList(Lcom/sma/smartv3/ui/device/WorldClockActivity;)Ljava/util/List;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMListAdapter(Lcom/sma/smartv3/ui/device/WorldClockActivity;)Lcom/android/mltcode/paycertificationapi/XII0Oi10O;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMLocalWorldClock$p(Lcom/sma/smartv3/ui/device/WorldClockActivity;)Lcom/szabh/smable3/entity/BleWorldClock;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/device/WorldClockActivity;->mLocalWorldClock:Lcom/szabh/smable3/entity/BleWorldClock;

    return-object p0
.end method

.method public static final synthetic access$setMLocalWorldClock$p(Lcom/sma/smartv3/ui/device/WorldClockActivity;Lcom/szabh/smable3/entity/BleWorldClock;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/WorldClockActivity;->mLocalWorldClock:Lcom/szabh/smable3/entity/BleWorldClock;

    return-void
.end method

.method public static final synthetic access$showLocalTime(Lcom/sma/smartv3/ui/device/WorldClockActivity;Lcom/szabh/smable3/entity/BleWorldClock;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/WorldClockActivity;->showLocalTime(Lcom/szabh/smable3/entity/BleWorldClock;)V

    return-void
.end method

.method private static final btnBottom_delegate$lambda$0(Lcom/sma/smartv3/ui/device/WorldClockActivity;)Landroid/view/View;
    .locals 1

    const v0, 0x7f0a01b9

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    return-object p0
.end method

.method private final checkCount()V
    .locals 3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WorldClockActivity;->getTvTip()Landroid/widget/TextView;

    move-result-object v0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->XOO0Xi()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    const v2, 0x7f14161b

    invoke-virtual {p0, v2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "checkCount:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WorldClockActivity;->getBtnBottom()Landroid/view/View;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x4

    if-ge v1, v2, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final getBtnBottom()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/WorldClockActivity;->btnBottom$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method private final getList()Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleWorldClock;",
            ">;"
        }
    .end annotation

    sget-object v0, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v1, Lcom/szabh/smable3/BleKey;->WORLD_CLOCK:Lcom/szabh/smable3/BleKey;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-class v2, Lcom/szabh/smable3/entity/BleWorldClock;

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/szabh/smable3/component/BaseBleCache;->getList$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/lang/Class;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/szabh/smable3/entity/BleWorldClock;

    invoke-virtual {v3}, Lcom/szabh/smable3/entity/BleWorldClock;->isLocal()I

    move-result v3

    const/4 v4, 0x1

    if-ne v3, v4, :cond_0

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    check-cast v2, Lcom/szabh/smable3/entity/BleWorldClock;

    if-eqz v2, :cond_2

    invoke-interface {v0, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    iget v2, p0, Lcom/sma/smartv3/ui/device/WorldClockActivity;->MAX:I

    if-gt v1, v2, :cond_3

    return-object v0

    :cond_3
    const/4 v1, 0x0

    invoke-interface {v0, v1, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v5

    sget-object v3, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    sget-object v4, Lcom/szabh/smable3/BleKey;->WORLD_CLOCK:Lcom/szabh/smable3/BleKey;

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lcom/szabh/smable3/component/BaseBleCache;->putList$default(Lcom/szabh/smable3/component/BaseBleCache;Lcom/szabh/smable3/BleKey;Ljava/util/List;Lcom/szabh/smable3/BleKeyFlag;ILjava/lang/Object;)V

    return-object v5
.end method

.method private final getMtvLocalName()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/WorldClockActivity;->mtvLocalName$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getMtvLocalTime()Lcom/sma/smartv3/view/MyDigitalClock;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/WorldClockActivity;->mtvLocalTime$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/MyDigitalClock;

    return-object v0
.end method

.method private final getTvTip()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/WorldClockActivity;->tvTip$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private static final initView$lambda$0$0(Lcom/sma/smartv3/ui/device/WorldClockActivity;Lcom/android/mltcode/paycertificationapi/fi5;)V
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

.method private static final initView$lambda$0$1(Lcom/sma/smartv3/ui/device/WorldClockActivity;ILcom/android/mltcode/paycertificationapi/fi5;I)Z
    .locals 0

    new-instance p2, Lcom/android/mltcode/paycertificationapi/l67;

    invoke-direct {p2, p0, p1}, Lcom/android/mltcode/paycertificationapi/l67;-><init>(Lcom/sma/smartv3/ui/device/WorldClockActivity;I)V

    const/4 p0, 0x0

    const/4 p1, 0x0

    const/4 p3, 0x1

    invoke-static {p1, p2, p3, p0}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    move-result p0

    xor-int/2addr p0, p3

    return p0
.end method

.method private static final initView$lambda$0$1$0(Lcom/sma/smartv3/ui/device/WorldClockActivity;ILcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 9

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/szabh/smable3/BleKey;->WORLD_CLOCK:Lcom/szabh/smable3/BleKey;

    sget-object v3, Lcom/szabh/smable3/BleKeyFlag;->DELETE:Lcom/szabh/smable3/BleKeyFlag;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/szabh/smable3/entity/BleWorldClock;

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleIdObject;->getMId()I

    move-result v4

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v8}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt8$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZILjava/lang/Object;)Z

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WorldClockActivity;->checkCount()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final mtvLocalName_delegate$lambda$0(Lcom/sma/smartv3/ui/device/WorldClockActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0cc7

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final mtvLocalTime_delegate$lambda$0(Lcom/sma/smartv3/ui/device/WorldClockActivity;)Lcom/sma/smartv3/view/MyDigitalClock;
    .locals 1

    const v0, 0x7f0a1897

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Lcom/sma/smartv3/view/MyDigitalClock;

    return-object p0
.end method

.method private final objectToBleObject(Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;)Lcom/szabh/smable3/entity/BleWorldClock;
    .locals 9

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->I0IIOi()I

    move-result v0

    iget v1, p0, Lcom/sma/smartv3/ui/device/WorldClockActivity;->DIFF:I

    div-int v4, v0, v1

    new-instance v2, Lcom/szabh/smable3/entity/BleWorldClock;

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->IO()Z

    move-result v0

    invoke-static {v0}, Lcom/android/mltcode/paycertificationapi/OiOX0i;->iO(Z)I

    move-result v3

    invoke-virtual {p1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;->iO()Ljava/lang/String;

    move-result-object v6

    const-string p1, "getCityName(...)"

    invoke-static {v6, p1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/szabh/smable3/entity/BleWorldClock;-><init>(IIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method private static final onActivityResult$lambda$0(Landroid/content/Intent;Lcom/sma/smartv3/ui/device/WorldClockActivity;Lcom/szabh/smable3/component/BleConnector;)Lkotlin/Unit;
    .locals 8

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker;->XIi00iiXO(Landroid/content/Intent;)Ljava/util/ArrayList;

    move-result-object p0

    const-string p2, "obtainResult(...)"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    sget-object v1, Lcom/szabh/smable3/BleKey;->WORLD_CLOCK:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->CREATE:Lcom/szabh/smable3/BleKeyFlag;

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-direct {p1, p2}, Lcom/sma/smartv3/ui/device/WorldClockActivity;->objectToBleObject(Lcom/sma/smartv3/ui/timezonepicker/TimeZoneResult;)Lcom/szabh/smable3/entity/BleWorldClock;

    move-result-object v3

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendObject$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;Lcom/bestmafen/baseble/data/BleBuffer;ZZILjava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->clear()V

    invoke-virtual {p1}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object p0

    invoke-direct {p1}, Lcom/sma/smartv3/ui/device/WorldClockActivity;->getList()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p1}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMListAdapter()Lcom/android/mltcode/paycertificationapi/XII0Oi10O;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final showLocalTime(Lcom/szabh/smable3/entity/BleWorldClock;)V
    .locals 3

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WorldClockActivity;->getMtvLocalTime()Lcom/sma/smartv3/view/MyDigitalClock;

    move-result-object v0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f08168e

    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WorldClockActivity;->getMtvLocalTime()Lcom/sma/smartv3/view/MyDigitalClock;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/view/MyDigitalClock;->getMCalendar()Ljava/util/Calendar;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "GMT+0"

    invoke-static {v1}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/Calendar;->setTimeZone(Ljava/util/TimeZone;)V

    :cond_0
    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WorldClockActivity;->getMtvLocalTime()Lcom/sma/smartv3/view/MyDigitalClock;

    move-result-object v0

    invoke-virtual {p1}, Lcom/szabh/smable3/entity/BleWorldClock;->getMTimeZoneOffset()I

    move-result p1

    iget v1, p0, Lcom/sma/smartv3/ui/device/WorldClockActivity;->DIFF:I

    mul-int/2addr p1, v1

    invoke-virtual {v0, p1}, Lcom/sma/smartv3/view/MyDigitalClock;->setMOffset(I)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WorldClockActivity;->getMtvLocalTime()Lcom/sma/smartv3/view/MyDigitalClock;

    move-result-object p1

    const-string v0, "HH:mm:ss"

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/view/MyDigitalClock;->setMFormat(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WorldClockActivity;->getMtvLocalName()Landroid/widget/TextView;

    move-result-object p1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/WorldClockActivity;->mLocalWorldClock:Lcom/szabh/smable3/entity/BleWorldClock;

    if-nez v0, :cond_1

    const-string v0, "mLocalWorldClock"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_1
    invoke-virtual {v0}, Lcom/szabh/smable3/entity/BleWorldClock;->getMCityName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private static final tvTip_delegate$lambda$0(Lcom/sma/smartv3/ui/device/WorldClockActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a188f

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 8
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/WorldClockActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/WorldClockActivity$OXO1;

    invoke-virtual {v0, p1}, Lcom/szabh/smable3/component/BleConnector;->addHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    new-instance v1, Lcom/szabh/smable3/entity/BleWorldClock;

    invoke-static {}, Ljava/util/TimeZone;->getDefault()Ljava/util/TimeZone;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {p1, v2, v3}, Ljava/util/TimeZone;->getOffset(J)I

    move-result p1

    iget v2, p0, Lcom/sma/smartv3/ui/device/WorldClockActivity;->DIFF:I

    div-int v3, p1, v2

    const p1, 0x7f140e27

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const-string p1, "getString(...)"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v2, 0x1

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/szabh/smable3/entity/BleWorldClock;-><init>(IIILjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, p0, Lcom/sma/smartv3/ui/device/WorldClockActivity;->mLocalWorldClock:Lcom/szabh/smable3/entity/BleWorldClock;

    invoke-virtual {v0}, Lcom/szabh/smable3/component/BleConnector;->isAvailable()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object v1, Lcom/szabh/smable3/BleKey;->WORLD_CLOCK:Lcom/szabh/smable3/BleKey;

    sget-object v2, Lcom/szabh/smable3/BleKeyFlag;->READ:Lcom/szabh/smable3/BleKeyFlag;

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/16 v3, 0xff

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lcom/szabh/smable3/component/BaseBleConnector;->sendInt8$default(Lcom/szabh/smable3/component/BaseBleConnector;Lcom/szabh/smable3/BleKey;Lcom/szabh/smable3/BleKeyFlag;IZZILjava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/szabh/smable3/entity/BleWorldClock;I)V
    .locals 3
    .param p1    # Lcom/android/mltcode/paycertificationapi/ug6;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Lcom/szabh/smable3/entity/BleWorldClock;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string p3, "holder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p2}, Lcom/szabh/smable3/entity/BleWorldClock;->getMTimeZoneOffset()I

    move-result p3

    iget v0, p0, Lcom/sma/smartv3/ui/device/WorldClockActivity;->DIFF:I

    mul-int/2addr p3, v0

    const v0, 0x7f0a1897

    .line 3
    invoke-virtual {p1, v0}, Lcom/android/mltcode/paycertificationapi/ug6;->O00(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/view/MyDigitalClock;

    .line 4
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f08168e

    .line 5
    invoke-static {v1, v2}, Lcom/android/mltcode/paycertificationapi/gk4;->O00(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    .line 6
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 7
    invoke-virtual {v0}, Lcom/sma/smartv3/view/MyDigitalClock;->getMCalendar()Ljava/util/Calendar;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v2, "GMT+0"

    invoke-static {v2}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/Calendar;->setTimeZone(Ljava/util/TimeZone;)V

    .line 8
    :cond_0
    invoke-virtual {v0, p3}, Lcom/sma/smartv3/view/MyDigitalClock;->setMOffset(I)V

    .line 9
    const-string p3, "HH:mm"

    invoke-virtual {v0, p3}, Lcom/sma/smartv3/view/MyDigitalClock;->setMFormat(Ljava/lang/String;)V

    const p3, 0x7f0a0cc7

    .line 10
    invoke-virtual {p1, p3}, Lcom/android/mltcode/paycertificationapi/ug6;->O00(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p2}, Lcom/szabh/smable3/entity/BleWorldClock;->getMCityName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public bridge synthetic initItem(Lcom/android/mltcode/paycertificationapi/ug6;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/szabh/smable3/entity/BleWorldClock;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/WorldClockActivity;->initItem(Lcom/android/mltcode/paycertificationapi/ug6;Lcom/szabh/smable3/entity/BleWorldClock;I)V

    return-void
.end method

.method public initList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/szabh/smable3/entity/BleWorldClock;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WorldClockActivity;->getList()Ljava/util/List;

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

    const v1, 0x7f14161a

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

    new-instance v1, Lcom/android/mltcode/paycertificationapi/j67;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/j67;-><init>(Lcom/sma/smartv3/ui/device/WorldClockActivity;)V

    invoke-virtual {v0, v1}, Lcom/baoyz/swipemenulistview/SwipeMenuListView;->setMenuCreator(Lcom/android/mltcode/paycertificationapi/hi5;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/k67;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/k67;-><init>(Lcom/sma/smartv3/ui/device/WorldClockActivity;)V

    invoke-virtual {v0, v1}, Lcom/baoyz/swipemenulistview/SwipeMenuListView;->setOnMenuItemClickListener(Lcom/baoyz/swipemenulistview/SwipeMenuListView$XIi00iiXO;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/WorldClockActivity;->mLocalWorldClock:Lcom/szabh/smable3/entity/BleWorldClock;

    if-nez v0, :cond_0

    const-string v0, "mLocalWorldClock"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    invoke-direct {p0, v0}, Lcom/sma/smartv3/ui/device/WorldClockActivity;->showLocalTime(Lcom/szabh/smable3/entity/BleWorldClock;)V

    return-void
.end method

.method public itemLayoutId()I
    .locals 1

    const v0, 0x7f0d0f37

    return v0
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0146

    return v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1
    .param p3    # Landroid/content/Intent;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    const/16 p2, 0x3e0

    if-ne p1, p2, :cond_0

    new-instance p1, Lcom/android/mltcode/paycertificationapi/m67;

    invoke-direct {p1, p3, p0}, Lcom/android/mltcode/paycertificationapi/m67;-><init>(Landroid/content/Intent;Lcom/sma/smartv3/ui/device/WorldClockActivity;)V

    const/4 p2, 0x1

    const/4 p3, 0x0

    const/4 v0, 0x0

    invoke-static {v0, p1, p2, p3}, Lcom/android/mltcode/paycertificationapi/X0IOiX1O;->XIi00iiXO(ZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final onBottomClick(Landroid/view/View;)V
    .locals 3
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;

    invoke-direct {p1, p0}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;-><init>(Landroid/app/Activity;)V

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->hideScrollbar(Z)Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;

    move-result-object p1

    iget v0, p0, Lcom/sma/smartv3/ui/device/WorldClockActivity;->MAX:I

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->setMaxSelectCount(I)Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->showTrack(Z)Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;

    move-result-object p1

    const/4 v1, -0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p1, v2}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->searchIconColor(Ljava/lang/Integer;)Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->setChoiceMode(I)Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->bubbleTextColor(I)Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;

    move-result-object p1

    const v1, 0x7f14008c

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->setTitleText(Ljava/lang/String;)Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->setLoadingType(I)Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;

    move-result-object p1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/list/BaseListActivity;->getMList()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt__IterablesKt;->X00XIX1(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/szabh/smable3/entity/BleWorldClock;

    invoke-virtual {v2}, Lcom/szabh/smable3/entity/BleWorldClock;->getMCityName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v1}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->setSelected(Ljava/util/List;)Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;

    move-result-object p1

    const/16 v0, 0x3e0

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/timezonepicker/TimeZonePicker$Builder;->showPickerForResult(I)V

    return-void
.end method

.method public onDestroy()V
    .locals 2

    sget-object v0, Lcom/szabh/smable3/component/BleConnector;->INSTANCE:Lcom/szabh/smable3/component/BleConnector;

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/WorldClockActivity;->mBleHandleCallback:Lcom/sma/smartv3/ui/device/WorldClockActivity$OXO1;

    invoke-virtual {v0, v1}, Lcom/szabh/smable3/component/BleConnector;->removeHandleCallback(Lcom/szabh/smable3/component/BleHandleCallback;)V

    invoke-super {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->onDestroy()V

    return-void
.end method

.method public onResume()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/FragmentActivity;->onResume()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/device/WorldClockActivity;->checkCount()V

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
