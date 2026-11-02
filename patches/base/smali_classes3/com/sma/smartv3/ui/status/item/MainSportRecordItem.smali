.class public Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMainSportRecordItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainSportRecordItem.kt\ncom/sma/smartv3/ui/status/item/MainSportRecordItem\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,250:1\n19#2:251\n15#2:252\n*S KotlinDebug\n*F\n+ 1 MainSportRecordItem.kt\ncom/sma/smartv3/ui/status/item/MainSportRecordItem\n*L\n133#1:251\n133#1:252\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMainSportRecordItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainSportRecordItem.kt\ncom/sma/smartv3/ui/status/item/MainSportRecordItem\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,250:1\n19#2:251\n15#2:252\n*S KotlinDebug\n*F\n+ 1 MainSportRecordItem.kt\ncom/sma/smartv3/ui/status/item/MainSportRecordItem\n*L\n133#1:251\n133#1:252\n*E\n"
    }
.end annotation


# instance fields
.field public gpsStatusIv:Landroid/widget/ImageView;

.field private final initEvent:Z

.field private isEmptyData:Z

.field public mContext:Landroid/content/Context;

.field public rv:Landroidx/recyclerview/widget/RecyclerView;

.field public sportItemDetail:Landroid/widget/LinearLayout;

.field public sportName:Lcom/sma/smartv3/view/text/PFMedium;

.field private sportRecordData:Lcom/sma/smartv3/model/SportRecordData;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private sportRecordItemCommonData:Lcom/sma/smartv3/model/SportRecordItemCommonData;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field public sportSourceIv:Landroid/widget/ImageView;

.field public sportStartTimeTv:Lcom/sma/smartv3/view/text/DINCondBold;

.field public sportTypeIv:Landroid/widget/ImageView;

.field public userProfile:Lcom/sma/smartv3/model/AppUser;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->initEvent:Z

    new-instance v0, Lcom/sma/smartv3/model/SportRecordData;

    invoke-direct {v0}, Lcom/sma/smartv3/model/SportRecordData;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    return-void
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->bindView$lambda$1(Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->bindView$lambda$2(Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XOO0ii0(Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->bindView$lambda$0$0(Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method private static final bindView$lambda$0$0(Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->getSportItemDetail()Landroid/widget/LinearLayout;

    move-result-object p0

    invoke-virtual {p0, p2}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method private static final bindView$lambda$1(Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;Landroid/view/View;)V
    .locals 6

    iget-boolean p1, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->isEmptyData:Z

    if-eqz p1, :cond_0

    goto/16 :goto_0

    :cond_0
    sget-object p1, Lcom/android/mltcode/paycertificationapi/w85;->OXO1:Lcom/android/mltcode/paycertificationapi/w85;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/w85;->OXO1()Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/SportRecordData;->getMSource()I

    move-result p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "sportRecordData.mSource"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->i([Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    invoke-virtual {p1}, Lcom/sma/smartv3/model/SportRecordData;->getMSource()I

    move-result p1

    const/4 v0, 0x1

    const-class v1, Lcom/sma/smartv3/ui/sport/SportDetailActivity;

    const-class v2, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;

    const-string v3, "mArg2"

    const-class v4, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;

    const-string v5, "mArg1"

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_1

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->getMContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->getMContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object p0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    invoke-virtual {v0, v3, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_1
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/i72;->iIXX0i()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->getMContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->getMContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object p0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    invoke-virtual {p0}, Lcom/sma/smartv3/model/SportRecordData;->getMWorkoutId()I

    move-result p0

    invoke-virtual {v0, v5, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->getMContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->getMContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object p0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    invoke-virtual {p0}, Lcom/sma/smartv3/model/SportRecordData;->getMWorkoutId()I

    move-result p0

    invoke-virtual {v0, v5, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_3
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/i72;->iIXX0i()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->getMContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->getMContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object p0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    invoke-virtual {p0}, Lcom/sma/smartv3/model/SportRecordData;->getMWorkoutId()I

    move-result p0

    invoke-virtual {v0, v5, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_4
    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/i72;->XII01OO1I()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->getMContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->getMContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object p0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    invoke-virtual {p0}, Lcom/sma/smartv3/model/SportRecordData;->getMWorkoutId()I

    move-result p0

    invoke-virtual {v0, v5, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_5
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->getMContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->getMContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object p0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    invoke-virtual {v0, v3, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_6
    :goto_0
    return-void
.end method

.method private static final bindView$lambda$2(Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;Landroid/view/View;)V
    .locals 2

    sget-object p1, Lcom/android/mltcode/paycertificationapi/w85;->OXO1:Lcom/android/mltcode/paycertificationapi/w85;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/w85;->OXO1()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->getMContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->getMContext()Landroid/content/Context;

    move-result-object p0

    const-class v1, Lcom/sma/smartv3/ui/status/SportRecordsActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_0
    return-void
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

    const v0, 0x7f0a0adc

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->setSportSourceIv(Landroid/widget/ImageView;)V

    const v0, 0x7f0a0ae5

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->setSportTypeIv(Landroid/widget/ImageView;)V

    const v0, 0x7f0a0422

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/ImageView;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->setGpsStatusIv(Landroid/widget/ImageView;)V

    const v0, 0x7f0a0a9a

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/sma/smartv3/view/text/PFMedium;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->setSportName(Lcom/sma/smartv3/view/text/PFMedium;)V

    const v0, 0x7f0a0ade

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Lcom/sma/smartv3/view/text/DINCondBold;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->setSportStartTimeTv(Lcom/sma/smartv3/view/text/DINCondBold;)V

    const v0, 0x7f0a0a97

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/LinearLayout;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->setSportItemDetail(Landroid/widget/LinearLayout;)V

    const v0, 0x7f0a09c1

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0, v0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->setRv(Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->getRv()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/c20;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/c20;-><init>(Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->getSportItemDetail()Landroid/widget/LinearLayout;

    move-result-object v0

    new-instance v1, Lcom/android/mltcode/paycertificationapi/d20;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/d20;-><init>(Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0a0acd

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/e20;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/e20;-><init>(Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->getRv()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "getContext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->setMContext(Landroid/content/Context;)V

    return-void
.end method

.method public final getGpsStatusIv()Landroid/widget/ImageView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->gpsStatusIv:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "gpsStatusIv"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public getInitEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->initEvent:Z

    return v0
.end method

.method public final getMContext()Landroid/content/Context;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public getRv()Landroidx/recyclerview/widget/RecyclerView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->rv:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "rv"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getSportItemDetail()Landroid/widget/LinearLayout;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportItemDetail:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "sportItemDetail"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getSportName()Lcom/sma/smartv3/view/text/PFMedium;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportName:Lcom/sma/smartv3/view/text/PFMedium;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "sportName"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getSportRecordData()Lcom/sma/smartv3/model/SportRecordData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    return-object v0
.end method

.method public final getSportRecordItemCommonData()Lcom/sma/smartv3/model/SportRecordItemCommonData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportRecordItemCommonData:Lcom/sma/smartv3/model/SportRecordItemCommonData;

    return-object v0
.end method

.method public final getSportSourceIv()Landroid/widget/ImageView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportSourceIv:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "sportSourceIv"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getSportStartTimeTv()Lcom/sma/smartv3/view/text/DINCondBold;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportStartTimeTv:Lcom/sma/smartv3/view/text/DINCondBold;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "sportStartTimeTv"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getSportTypeIv()Landroid/widget/ImageView;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportTypeIv:Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "sportTypeIv"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getUserProfile()Lcom/sma/smartv3/model/AppUser;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->userProfile:Lcom/sma/smartv3/model/AppUser;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "userProfile"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public initView()V
    .locals 32

    move-object/from16 v0, p0

    sget-object v1, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v1

    new-instance v2, Lcom/sma/smartv3/model/AppUser;

    const v30, 0x7ffffff

    const/16 v31, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

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

    invoke-direct/range {v2 .. v31}, Lcom/sma/smartv3/model/AppUser;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIFFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sma/smartv3/model/ThirdPlatform;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/google/gson/Gson;

    invoke-direct {v3}, Lcom/google/gson/Gson;-><init>()V

    const-class v4, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1, v4}, Lcom/google/gson/Gson;->fromJson(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    check-cast v2, Lcom/sma/smartv3/model/AppUser;

    invoke-virtual {v0, v2}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->setUserProfile(Lcom/sma/smartv3/model/AppUser;)V

    const/16 v1, 0x14

    const/4 v2, 0x0

    invoke-static {v2, v1}, Lcom/sma/smartv3/model/SportRecordDataKt;->getSportRecordList(II)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->isEmptyData:Z

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->noData()V

    return-void

    :cond_1
    iput-boolean v2, v0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->isEmptyData:Z

    invoke-virtual {v0, v2}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemHidden(Z)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "get(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/sma/smartv3/model/SportRecordData;

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->parseSportRecordItemCommonDataMethod()Lcom/sma/smartv3/model/SportRecordItemCommonData;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportRecordItemCommonData:Lcom/sma/smartv3/model/SportRecordItemCommonData;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->getSportSourceIv()Landroid/widget/ImageView;

    move-result-object v1

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    invoke-virtual {v2}, Lcom/sma/smartv3/model/SportRecordData;->getMSource()I

    move-result v2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_2

    const v2, 0x7f081301

    goto :goto_1

    :cond_2
    const v2, 0x7f0813cd

    :goto_1
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->getSportTypeIv()Landroid/widget/ImageView;

    move-result-object v1

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportRecordItemCommonData:Lcom/sma/smartv3/model/SportRecordItemCommonData;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/model/SportRecordItemCommonData;->getWorkoutImg()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->getGpsStatusIv()Landroid/widget/ImageView;

    move-result-object v1

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportRecordItemCommonData:Lcom/sma/smartv3/model/SportRecordItemCommonData;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/model/SportRecordItemCommonData;->getGpsState()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->getSportName()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v1

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportRecordItemCommonData:Lcom/sma/smartv3/model/SportRecordItemCommonData;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/model/SportRecordItemCommonData;->getWorkoutModeName()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(I)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->getSportStartTimeTv()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v1

    iget-object v2, v0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportRecordItemCommonData:Lcom/sma/smartv3/model/SportRecordItemCommonData;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/sma/smartv3/model/SportRecordItemCommonData;->getSportStartTime()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    :goto_2
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->getRv()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->setAdapterMethod(Landroidx/recyclerview/widget/RecyclerView;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d1077

    return v0
.end method

.method public final noData()V
    .locals 2

    sget-object v0, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/i72;->i01OOiI()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemHidden(Z)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->getSportName()Lcom/sma/smartv3/view/text/PFMedium;

    move-result-object v0

    const v1, 0x7f140ffb

    invoke-static {v1}, Lcom/sma/smartv3/util/UtilsKt;->XXO(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->getSportStartTimeTv()Lcom/sma/smartv3/view/text/DINCondBold;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final onActivityChanged(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "activity_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onActivityChanged"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->initView()V

    return-void
.end method

.method public final onHeartRateChanged(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "heart_rate_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onHeartRateChanged"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->initView()V

    return-void
.end method

.method public final onLocationChanged(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation runtime Lcom/android/mltcode/paycertificationapi/sf5;
        tag = "location_change"
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "onLocationChanged"

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/blankj/utilcode/util/LogUtils;->v([Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->initView()V

    return-void
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

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->initView()V

    return-void
.end method

.method public parseSportRecordItemCommonDataMethod()Lcom/sma/smartv3/model/SportRecordItemCommonData;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->getMContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->getUserProfile()Lcom/sma/smartv3/model/AppUser;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    invoke-static {v0, v1, v2}, Lcom/sma/smartv3/model/SportRecordDataKt;->parseSportRecordItemCommonData(Landroid/content/Context;Lcom/sma/smartv3/model/AppUser;Lcom/sma/smartv3/model/SportRecordData;)Lcom/sma/smartv3/model/SportRecordItemCommonData;

    move-result-object v0

    return-object v0
.end method

.method public setAdapterMethod(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 4
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportRecordItemCommonData:Lcom/sma/smartv3/model/SportRecordItemCommonData;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/model/SportRecordItemCommonData;->getSpanCount()I

    move-result v2

    invoke-direct {v0, v1, v2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    new-instance v0, Lcom/sma/smartv3/model/SportRecordItemAdapter;

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportRecordItemCommonData:Lcom/sma/smartv3/model/SportRecordItemCommonData;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/sma/smartv3/model/SportRecordItemCommonData;->getContentList()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "getContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1, v2}, Lcom/sma/smartv3/model/SportRecordItemAdapter;-><init>(Ljava/util/List;Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    return-void
.end method

.method public final setGpsStatusIv(Landroid/widget/ImageView;)V
    .locals 1
    .param p1    # Landroid/widget/ImageView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->gpsStatusIv:Landroid/widget/ImageView;

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

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->mContext:Landroid/content/Context;

    return-void
.end method

.method public setRv(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->rv:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method

.method public final setSportItemDetail(Landroid/widget/LinearLayout;)V
    .locals 1
    .param p1    # Landroid/widget/LinearLayout;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportItemDetail:Landroid/widget/LinearLayout;

    return-void
.end method

.method public final setSportName(Lcom/sma/smartv3/view/text/PFMedium;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/view/text/PFMedium;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportName:Lcom/sma/smartv3/view/text/PFMedium;

    return-void
.end method

.method public final setSportRecordData(Lcom/sma/smartv3/model/SportRecordData;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/model/SportRecordData;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    return-void
.end method

.method public final setSportRecordItemCommonData(Lcom/sma/smartv3/model/SportRecordItemCommonData;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/model/SportRecordItemCommonData;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportRecordItemCommonData:Lcom/sma/smartv3/model/SportRecordItemCommonData;

    return-void
.end method

.method public final setSportSourceIv(Landroid/widget/ImageView;)V
    .locals 1
    .param p1    # Landroid/widget/ImageView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportSourceIv:Landroid/widget/ImageView;

    return-void
.end method

.method public final setSportStartTimeTv(Lcom/sma/smartv3/view/text/DINCondBold;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/view/text/DINCondBold;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportStartTimeTv:Lcom/sma/smartv3/view/text/DINCondBold;

    return-void
.end method

.method public final setSportTypeIv(Landroid/widget/ImageView;)V
    .locals 1
    .param p1    # Landroid/widget/ImageView;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->sportTypeIv:Landroid/widget/ImageView;

    return-void
.end method

.method public final setUserProfile(Lcom/sma/smartv3/model/AppUser;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/model/AppUser;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecordItem;->userProfile:Lcom/sma/smartv3/model/AppUser;

    return-void
.end method
