.class public final Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;
.super Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMySportRecordFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MySportRecordFragment.kt\ncom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1869#2,2:130\n1#3:132\n*S KotlinDebug\n*F\n+ 1 MySportRecordFragment.kt\ncom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment\n*L\n87#1:130,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMySportRecordFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MySportRecordFragment.kt\ncom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1869#2,2:130\n1#3:132\n*S KotlinDebug\n*F\n+ 1 MySportRecordFragment.kt\ncom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment\n*L\n87#1:130,2\n*E\n"
    }
.end annotation


# instance fields
.field private dataList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/MySportRecordList;",
            ">;"
        }
    .end annotation
.end field

.field private mSportMode:I

.field private final mWorkoutDao$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/g01;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/g01;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;->mWorkoutDao$delegate:Lkotlin/Lazy;

    invoke-static {}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iI()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;->dataList:Ljava/util/List;

    return-void
.end method

.method public static synthetic I0IIOi(Lcom/sma/smartv3/model/MySportRecordList;Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;->initItemView$lambda$0(Lcom/sma/smartv3/model/MySportRecordList;Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic IO(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;->findData$lambda$0$0(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;->onRefresh$lambda$0(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;)V

    return-void
.end method

.method public static synthetic O00()Lcom/sma/smartv3/db/dao/WorkoutDao;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;->mWorkoutDao_delegate$lambda$0()Lcom/sma/smartv3/db/dao/WorkoutDao;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic OIi0(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;->showData$lambda$0(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XO0O10(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;->showData$lambda$0$0(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XOO0ii0(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;->findData$lambda$0$0$0(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMActivity(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;)Landroid/app/Activity;
    .locals 0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseFragment;->getMActivity()Landroid/app/Activity;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getMWorkoutDao(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;)Lcom/sma/smartv3/db/dao/WorkoutDao;
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;->getMWorkoutDao()Lcom/sma/smartv3/db/dao/WorkoutDao;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$setDataList$p(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;->dataList:Ljava/util/List;

    return-void
.end method

.method public static final synthetic access$showData(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;->showData()V

    return-void
.end method

.method private final findData(Lcom/angcyo/dsladapter/DslAdapter;Ljava/util/List;)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n",
            "ClickableViewAccessibility"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/angcyo/dsladapter/DslAdapter;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/MySportRecordList;",
            ">;)V"
        }
    .end annotation

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/MySportRecordList;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/j01;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/j01;-><init>(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;)V

    const v1, 0x7f0d0f21

    invoke-static {p1, v1, v0}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static final findData$lambda$0$0(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemSwipeMenuFlag(I)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/m01;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/m01;-><init>(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final findData$lambda$0$0$0(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 1

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<unused var>"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;->initItemView(Lcom/angcyo/dsladapter/DslViewHolder;I)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final getMWorkoutDao()Lcom/sma/smartv3/db/dao/WorkoutDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;->mWorkoutDao$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/dao/WorkoutDao;

    return-object v0
.end method

.method public static synthetic iO(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;->showData$lambda$0$0$0(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private final initItemView(Lcom/angcyo/dsladapter/DslViewHolder;I)V
    .locals 5

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;->dataList:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sma/smartv3/model/MySportRecordList;

    const v0, 0x7f0a0afa

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Lcom/sma/smartv3/model/MySportRecordList;->getIcon()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    :cond_0
    const v1, 0x7f0a0afc

    invoke-virtual {p1, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p2}, Lcom/sma/smartv3/model/MySportRecordList;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    const v1, 0x7f0a0afd

    invoke-virtual {p1, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {p2}, Lcom/sma/smartv3/model/MySportRecordList;->getValueStr()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    invoke-virtual {p2}, Lcom/sma/smartv3/model/MySportRecordList;->getTime()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-eqz v1, :cond_3

    const v1, 0x7f0a0afb

    invoke-virtual {p1, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iiIOiX()Ljava/text/SimpleDateFormat;

    move-result-object v2

    invoke-virtual {p2}, Lcom/sma/smartv3/model/MySportRecordList;->getTime()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    invoke-virtual {p2}, Lcom/sma/smartv3/model/MySportRecordList;->getIconInt()I

    move-result v1

    const/16 v2, 0x3e8

    if-lt v1, v2, :cond_4

    if-eqz v0, :cond_5

    const/high16 v1, 0x41600000    # 14.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    goto :goto_0

    :cond_4
    if-eqz v0, :cond_5

    const/high16 v1, 0x41880000    # 17.0f

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V

    :cond_5
    :goto_0
    if-eqz v0, :cond_7

    invoke-virtual {p2}, Lcom/sma/smartv3/model/MySportRecordList;->getIconInt()I

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {p2}, Lcom/sma/smartv3/model/MySportRecordList;->getIconInt()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_6
    const-string v1, ""

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_7
    new-instance v0, Lcom/android/mltcode/paycertificationapi/f01;

    invoke-direct {v0, p2, p0}, Lcom/android/mltcode/paycertificationapi/f01;-><init>(Lcom/sma/smartv3/model/MySportRecordList;Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;)V

    const p2, 0x7f0a09af

    invoke-virtual {p1, p2, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->click(ILandroid/view/View$OnClickListener;)V

    return-void
.end method

.method private static final initItemView$lambda$0(Lcom/sma/smartv3/model/MySportRecordList;Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;Landroid/view/View;)V
    .locals 2

    invoke-virtual {p0}, Lcom/sma/smartv3/model/MySportRecordList;->getWorkoutId()I

    move-result p2

    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    new-instance p2, Landroid/content/Intent;

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object v0

    const-class v1, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;

    invoke-direct {p2, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "mArg1"

    invoke-virtual {p0}, Lcom/sma/smartv3/model/MySportRecordList;->getWorkoutId()I

    move-result p0

    invoke-virtual {v0, v1, p0}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    invoke-virtual {p2, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    invoke-virtual {p1, p2}, Landroidx/fragment/app/Fragment;->startActivity(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method private static final mWorkoutDao_delegate$lambda$0()Lcom/sma/smartv3/db/dao/WorkoutDao;
    .locals 1

    sget-object v0, Lcom/sma/smartv3/db/MyDb;->INSTANCE:Lcom/sma/smartv3/db/MyDb;

    invoke-virtual {v0}, Lcom/sma/smartv3/db/MyDb;->getMDatabase()Lcom/sma/smartv3/db/AppDatabase;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/db/AppDatabase;->workoutDao()Lcom/sma/smartv3/db/dao/WorkoutDao;

    move-result-object v0

    return-object v0
.end method

.method private static final onRefresh$lambda$0(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;)V
    .locals 1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getRefreshLayout()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    return-void
.end method

.method private final showData()V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/h01;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/h01;-><init>(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final showData$lambda$0(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapter;->clearAllItems()V

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-static {p1, v0, v1, v0, v1}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslAdapter;->getDslAdapterStatusItem()Lcom/angcyo/dsladapter/DslAdapterStatusItem;

    move-result-object p1

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/BaseDslStateItem;->getItemStateLayoutMap()Ljava/util/HashMap;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const v1, 0x7f0d1063

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object p1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/l01;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/l01;-><init>(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->post(Lkotlin/jvm/functions/Function0;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;)Lkotlin/Unit;
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/e01;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/e01;-><init>(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showData$lambda$0$0$0(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 4

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p1, v0, v1, v2, v1}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    iget-object v3, p0, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;->dataList:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object p0

    const/4 p1, 0x1

    invoke-static {p0, p1, v1, v2, v1}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;->dataList:Ljava/util/List;

    invoke-direct {p0, p1, v1}, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;->findData(Lcom/angcyo/dsladapter/DslAdapter;Ljava/util/List;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapter;->setLoadMoreEnable(Z)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final getMSportMode()I
    .locals 1

    iget v0, p0, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;->mSportMode:I

    return v0
.end method

.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0e77

    return v0
.end method

.method public onInitBaseLayoutAfter()V
    .locals 6

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->onInitBaseLayoutAfter()V

    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v0

    new-instance v3, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment$onInitBaseLayoutAfter$1;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment$onInitBaseLayoutAfter$1;-><init>(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method public onRefresh()V
    .locals 4

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerFragment;->onRefresh()V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/k01;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/k01;-><init>(Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;)V

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public recyclerViewId()I
    .locals 1

    const v0, 0x7f0a09c1

    return v0
.end method

.method public refreshLayoutId()I
    .locals 1

    const v0, 0x7f0a0b16

    return v0
.end method

.method public final setMSportMode(I)V
    .locals 0

    iput p1, p0, Lcom/sma/smartv3/ui/sport/v2fragment/MySportRecordFragment;->mSportMode:I

    return-void
.end method
