.class public Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSportListRecordItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportListRecordItem.kt\ncom/sma/smartv3/ui/sport/item/SportListRecordItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,161:1\n1#2:162\n19#3:163\n15#3:164\n*S KotlinDebug\n*F\n+ 1 SportListRecordItem.kt\ncom/sma/smartv3/ui/sport/item/SportListRecordItem\n*L\n123#1:163\n123#1:164\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSportListRecordItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportListRecordItem.kt\ncom/sma/smartv3/ui/sport/item/SportListRecordItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,161:1\n1#2:162\n19#3:163\n15#3:164\n*S KotlinDebug\n*F\n+ 1 SportListRecordItem.kt\ncom/sma/smartv3/ui/sport/item/SportListRecordItem\n*L\n123#1:163\n123#1:164\n*E\n"
    }
.end annotation


# instance fields
.field private final initEvent:Z

.field public mContext:Landroid/content/Context;

.field private mWorkout:Lcom/sma/smartv3/db/entity/Workout;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private final mWorkoutDao$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private moreRecordLayout:Landroid/view/View;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private recordLayout:Landroid/view/View;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private sourceIcon:Landroid/widget/ImageView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private sportCalorieDuration:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private sportDistance:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private sportIcon:Landroid/widget/ImageView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private sportStartTime:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private sportTitle:Landroid/widget/TextView;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private workoutLayout:Landroid/view/View;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/i05;

    invoke-direct {v0}, Lcom/android/mltcode/paycertificationapi/i05;-><init>()V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->mWorkoutDao$delegate:Lkotlin/Lazy;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->initEvent:Z

    return-void
.end method

.method public static synthetic IiI10X()Lcom/sma/smartv3/db/dao/WorkoutDao;
    .locals 1

    invoke-static {}, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->mWorkoutDao_delegate$lambda$0()Lcom/sma/smartv3/db/dao/WorkoutDao;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->initView$lambda$3(Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XOO0ii0(Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->initView$lambda$5(Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;Landroid/view/View;)V

    return-void
.end method

.method private final getMWorkoutDao()Lcom/sma/smartv3/db/dao/WorkoutDao;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->mWorkoutDao$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/db/dao/WorkoutDao;

    return-object v0
.end method

.method private static final initView$lambda$3(Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;Landroid/view/View;)V
    .locals 2

    new-instance p1, Landroid/content/Intent;

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->recordLayout:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-class v1, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/db/entity/Workout;->getMId()I

    move-result v0

    const-string v1, "mArg1"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->workoutLayout:Landroid/view/View;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_1
    return-void
.end method

.method private static final initView$lambda$5(Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;Landroid/view/View;)V
    .locals 2

    new-instance p1, Landroid/content/Intent;

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->recordLayout:Landroid/view/View;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-class v1, Lcom/sma/smartv3/ui/status/SportRecordsV3Activity;

    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->recordLayout:Landroid/view/View;

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_1
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


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 2
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a0b08

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->recordLayout:Landroid/view/View;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->setMContext(Landroid/content/Context;)V

    const v0, 0x7f0a0b09

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->moreRecordLayout:Landroid/view/View;

    const v0, 0x7f0a098e

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->sportIcon:Landroid/widget/ImageView;

    const v0, 0x7f0a02d4

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->workoutLayout:Landroid/view/View;

    const v0, 0x7f0a0990

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->sportTitle:Landroid/widget/TextView;

    const v0, 0x7f0a098f

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->sportStartTime:Landroid/widget/TextView;

    const v0, 0x7f0a0991

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->sportDistance:Landroid/widget/TextView;

    const v0, 0x7f0a098d

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->sportCalorieDuration:Landroid/widget/TextView;

    const v0, 0x7f0a001f

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->sourceIcon:Landroid/widget/ImageView;

    return-void
.end method

.method public getInitEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->initEvent:Z

    return v0
.end method

.method public final getMContext()Landroid/content/Context;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMWorkout()Lcom/sma/smartv3/db/entity/Workout;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    return-object v0
.end method

.method public final getMoreRecordLayout()Landroid/view/View;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->moreRecordLayout:Landroid/view/View;

    return-object v0
.end method

.method public final getWorkoutLayout()Landroid/view/View;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->workoutLayout:Landroid/view/View;

    return-object v0
.end method

.method public initView()V
    .locals 35

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->recordLayout:Landroid/view/View;

    if-nez v1, :cond_0

    goto/16 :goto_5

    :cond_0
    invoke-direct {v0}, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->getMWorkoutDao()Lcom/sma/smartv3/db/dao/WorkoutDao;

    move-result-object v1

    invoke-interface {v1}, Lcom/sma/smartv3/db/dao/WorkoutDao;->getDescList()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->IIII0iI(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/db/entity/Workout;

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    if-eqz v1, :cond_e

    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->sportIcon:Landroid/widget/ImageView;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    if-eqz v1, :cond_1

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_1
    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->getMContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v1

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->getMContext()Landroid/content/Context;

    move-result-object v3

    new-instance v4, Lcom/sma/smartv3/model/SportRecordData;

    invoke-direct {v4}, Lcom/sma/smartv3/model/SportRecordData;-><init>()V

    iget-object v5, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v5

    invoke-virtual {v4, v5}, Lcom/sma/smartv3/model/SportRecordData;->setMMode(I)V

    sget-object v5, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-static {v3, v4}, Lcom/sma/smartv3/model/SportRecordDataKt;->getWorkoutImage(Landroid/content/Context;Lcom/sma/smartv3/model/SportRecordData;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Integer;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v1

    iget-object v3, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->sportIcon:Landroid/widget/ImageView;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1, v3}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :cond_2
    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->sourceIcon:Landroid/widget/ImageView;

    if-eqz v1, :cond_4

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v1

    iget-object v3, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v3}, Lcom/sma/smartv3/db/entity/Workout;->getMSource()I

    move-result v3

    if-nez v3, :cond_3

    const v3, 0x7f081776

    goto :goto_0

    :cond_3
    const v3, 0x7f081768

    :goto_0
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Integer;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v1

    iget-object v3, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->sourceIcon:Landroid/widget/ImageView;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1, v3}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :cond_4
    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v1

    invoke-static {v1}, Lcom/android/mltcode/paycertificationapi/a15;->iO(I)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->sportIcon:Landroid/widget/ImageView;

    if-eqz v1, :cond_6

    const v3, 0x7f0816fd

    invoke-virtual {v1, v3}, Landroid/view/View;->setBackgroundResource(I)V

    goto :goto_1

    :cond_5
    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->sportIcon:Landroid/widget/ImageView;

    if-eqz v1, :cond_6

    const v3, 0x7f0816fc

    invoke-virtual {v1, v3}, Landroid/view/View;->setBackgroundResource(I)V

    :cond_6
    :goto_1
    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->sportTitle:Landroid/widget/TextView;

    if-eqz v1, :cond_7

    sget-object v3, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    iget-object v4, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v4

    invoke-virtual {v3, v4}, Lcom/android/mltcode/paycertificationapi/q62;->i01OOiI(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const v4, 0x7f06001e

    invoke-static {v3, v4}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_7
    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->sportStartTime:Landroid/widget/TextView;

    const/4 v3, 0x0

    if-eqz v1, :cond_8

    const/4 v4, 0x1

    invoke-static {v2, v4, v3}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->X1(ZILjava/lang/Object;)Ljava/text/SimpleDateFormat;

    move-result-object v4

    iget-object v5, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v5}, Lcom/sma/smartv3/db/entity/Workout;->getMStart()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_8
    sget-object v1, Lcom/android/mltcode/paycertificationapi/hu4;->OXO1:Lcom/android/mltcode/paycertificationapi/hu4;

    iget-object v4, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v4

    invoke-virtual {v1, v4}, Lcom/android/mltcode/paycertificationapi/hu4;->O10IXXX0X(I)Z

    move-result v1

    const v4, 0x7f140d64

    if-eqz v1, :cond_b

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v5, Lcom/sma/smartv3/model/AppUser;

    const v33, 0x7ffffff

    const/16 v34, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

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

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-direct/range {v5 .. v34}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lcom/google/gson/Gson;

    invoke-direct {v6}, Lcom/google/gson/Gson;-><init>()V

    const-class v7, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1, v7}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_9

    goto :goto_2

    :cond_9
    move-object v5, v1

    :goto_2
    check-cast v5, Lcom/sma/smartv3/model/AppUser;

    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/Workout;->getMDistance()I

    move-result v1

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v6

    const/4 v7, 0x4

    invoke-static {v1, v6, v2, v7, v3}, Lcom/android/mltcode/paycertificationapi/cp5;->X1ii(IIZILjava/lang/Object;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->sportDistance:Landroid/widget/TextView;

    if-eqz v2, :cond_a

    invoke-virtual {v5}, Lcom/sma/smartv3/model/AppUser;->getUnit()I

    move-result v3

    invoke-static {v3}, Lcom/android/mltcode/paycertificationapi/cp5;->XX0(I)I

    move-result v3

    invoke-static {v3}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_a
    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->sportCalorieDuration:Landroid/widget/TextView;

    if-eqz v1, :cond_d

    iget-object v2, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMCalorie()I

    move-result v2

    div-int/lit16 v2, v2, 0x3e8

    invoke-static {v4}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    iget-object v4, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lcom/sma/smartv3/db/entity/Workout;->getMDuration()I

    move-result v4

    mul-int/lit16 v4, v4, 0x3e8

    invoke-static {v4}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iXiX011(I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " | "

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_3

    :cond_b
    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->sportDistance:Landroid/widget/TextView;

    if-eqz v1, :cond_c

    iget-object v2, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMCalorie()I

    move-result v2

    div-int/lit16 v2, v2, 0x3e8

    invoke-static {v4}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_c
    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->sportCalorieDuration:Landroid/widget/TextView;

    if-eqz v1, :cond_d

    iget-object v2, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/db/entity/Workout;->getMDuration()I

    move-result v2

    mul-int/lit16 v2, v2, 0x3e8

    invoke-static {v2}, Lcom/android/mltcode/paycertificationapi/O0X11OiO;->iXiX011(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_d
    :goto_3
    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->workoutLayout:Landroid/view/View;

    if-eqz v1, :cond_14

    new-instance v2, Lcom/android/mltcode/paycertificationapi/j05;

    invoke-direct {v2, v0}, Lcom/android/mltcode/paycertificationapi/j05;-><init>(Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_4

    :cond_e
    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->sourceIcon:Landroid/widget/ImageView;

    const/16 v2, 0x8

    if-eqz v1, :cond_f

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_f
    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->sportIcon:Landroid/widget/ImageView;

    if-eqz v1, :cond_10

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    :cond_10
    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->sportCalorieDuration:Landroid/widget/TextView;

    const-string v2, ""

    if-eqz v1, :cond_11

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_11
    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->sportDistance:Landroid/widget/TextView;

    if-eqz v1, :cond_12

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_12
    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->sportStartTime:Landroid/widget/TextView;

    if-eqz v1, :cond_13

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_13
    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->sportTitle:Landroid/widget/TextView;

    if-eqz v1, :cond_14

    const v2, 0x7f140ffb

    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const v3, 0x7f06024d

    invoke-static {v2, v3}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_14
    :goto_4
    iget-object v1, v0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->moreRecordLayout:Landroid/view/View;

    if-eqz v1, :cond_15

    new-instance v2, Lcom/android/mltcode/paycertificationapi/k05;

    invoke-direct {v2, v0}, Lcom/android/mltcode/paycertificationapi/k05;-><init>(Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_15
    :goto_5
    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d1061

    return v0
.end method

.method public final onWorkoutChanged(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "workout_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onWorkoutChanged"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->initView()V

    return-void
.end method

.method public final setMContext(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->mContext:Landroid/content/Context;

    return-void
.end method

.method public final setMWorkout(Lcom/sma/smartv3/db/entity/Workout;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/db/entity/Workout;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->mWorkout:Lcom/sma/smartv3/db/entity/Workout;

    return-void
.end method

.method public final setMoreRecordLayout(Landroid/view/View;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->moreRecordLayout:Landroid/view/View;

    return-void
.end method

.method public final setWorkoutLayout(Landroid/view/View;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/item/SportListRecordItem;->workoutLayout:Landroid/view/View;

    return-void
.end method
