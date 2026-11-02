.class public final Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMainSportRecord2Item.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainSportRecord2Item.kt\ncom/sma/smartv3/ui/status/item/MainSportRecord2Item\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,197:1\n19#2:198\n15#2:199\n*S KotlinDebug\n*F\n+ 1 MainSportRecord2Item.kt\ncom/sma/smartv3/ui/status/item/MainSportRecord2Item\n*L\n51#1:198\n51#1:199\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMainSportRecord2Item.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainSportRecord2Item.kt\ncom/sma/smartv3/ui/status/item/MainSportRecord2Item\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,197:1\n19#2:198\n15#2:199\n*S KotlinDebug\n*F\n+ 1 MainSportRecord2Item.kt\ncom/sma/smartv3/ui/status/item/MainSportRecord2Item\n*L\n51#1:198\n51#1:199\n*E\n"
    }
.end annotation


# instance fields
.field private final initEvent:Z

.field public mContext:Landroid/content/Context;

.field private sportItemDetail:Landroid/widget/LinearLayout;

.field private sportName:Landroid/widget/TextView;

.field private sportRecordData:Lcom/sma/smartv3/model/SportRecordData;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private sportRecordItemCommonData:Lcom/sma/smartv3/model/SportRecordItemCommonData;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private sportStartTimeTv:Landroid/widget/TextView;

.field private sportTypeIv:Landroid/widget/ImageView;

.field private tvTime:Landroid/widget/TextView;

.field private tvUnit:Landroid/widget/TextView;

.field private tvValue:Landroid/widget/TextView;

.field private final userProfile:Lcom/sma/smartv3/model/AppUser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 32

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

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

    iput-object v2, v0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->userProfile:Lcom/sma/smartv3/model/AppUser;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->initEvent:Z

    return-void
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->bindView$lambda$0(Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->bindView$lambda$1(Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;Landroid/view/View;)V

    return-void
.end method

.method private static final bindView$lambda$0(Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;Landroid/view/View;)V
    .locals 7

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    if-nez p1, :cond_0

    goto/16 :goto_3

    :cond_0
    sget-object p1, Lcom/android/mltcode/paycertificationapi/w85;->OXO1:Lcom/android/mltcode/paycertificationapi/w85;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/w85;->OXO1()Z

    move-result p1

    if-eqz p1, :cond_d

    iget-object p1, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/sma/smartv3/model/SportRecordData;->getMSource()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_1
    move-object p1, v0

    :goto_0
    const-class v1, Lcom/sma/smartv3/ui/sport/SportDetailActivity;

    const-class v2, Lcom/sma/smartv3/ui/sport/SportDetailV2Activity;

    const-string v3, "mArg1"

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/4 v5, 0x2

    if-ne v4, v5, :cond_6

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/i72;->iIXX0i()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->getMContext()Landroid/content/Context;

    move-result-object p1

    new-instance v1, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->getMContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v1, v4, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object p0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Lcom/sma/smartv3/model/SportRecordData;->getMWorkoutId()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_3
    invoke-virtual {v1, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_4
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->getMContext()Landroid/content/Context;

    move-result-object p1

    new-instance v2, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->getMContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v2, v4, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object p0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    if-eqz p0, :cond_5

    invoke-virtual {p0}, Lcom/sma/smartv3/model/SportRecordData;->getMWorkoutId()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_5
    invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_6
    :goto_1
    const-string v4, "mArg2"

    const-class v5, Lcom/sma/smartv3/ui/status/SportRecordsDetailActivity;

    if-nez p1, :cond_7

    goto :goto_2

    :cond_7
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v6, 0x1

    if-ne p1, v6, :cond_c

    sget-object p1, Lcom/android/mltcode/paycertificationapi/i72;->OXO1:Lcom/android/mltcode/paycertificationapi/i72;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/i72;->iIXX0i()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->getMContext()Landroid/content/Context;

    move-result-object p1

    new-instance v1, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->getMContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v1, v4, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object p0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    if-eqz p0, :cond_8

    invoke-virtual {p0}, Lcom/sma/smartv3/model/SportRecordData;->getMWorkoutId()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_8
    invoke-virtual {v1, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_9
    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/i72;->XII01OO1I()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->getMContext()Landroid/content/Context;

    move-result-object p1

    new-instance v2, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->getMContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v2, v4, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object p0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    if-eqz p0, :cond_a

    invoke-virtual {p0}, Lcom/sma/smartv3/model/SportRecordData;->getMWorkoutId()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_a
    invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_b
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->getMContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->getMContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object p0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    invoke-virtual {v0, v4, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_c
    :goto_2
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->getMContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->getMContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    iget-object p0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    invoke-virtual {v0, v4, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_d
    :goto_3
    return-void
.end method

.method private static final bindView$lambda$1(Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;Landroid/view/View;)V
    .locals 2

    sget-object p1, Lcom/android/mltcode/paycertificationapi/w85;->OXO1:Lcom/android/mltcode/paycertificationapi/w85;

    invoke-virtual {p1}, Lcom/android/mltcode/paycertificationapi/w85;->OXO1()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->getMContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->getMContext()Landroid/content/Context;

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

    const v0, 0x7f0a0ae5

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->sportTypeIv:Landroid/widget/ImageView;

    const v0, 0x7f0a0a9a

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->sportName:Landroid/widget/TextView;

    const v0, 0x7f0a0ade

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->sportStartTimeTv:Landroid/widget/TextView;

    const v0, 0x7f0a18b0

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->tvValue:Landroid/widget/TextView;

    const v0, 0x7f0a18ab

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->tvUnit:Landroid/widget/TextView;

    const v0, 0x7f0a188d

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->tvTime:Landroid/widget/TextView;

    const v0, 0x7f0a0a97

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->sportItemDetail:Landroid/widget/LinearLayout;

    if-nez v0, :cond_0

    const-string v0, "sportItemDetail"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    :cond_0
    new-instance v1, Lcom/android/mltcode/paycertificationapi/a20;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/a20;-><init>(Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f0a0acd

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->view(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v1, Lcom/android/mltcode/paycertificationapi/b20;

    invoke-direct {v1, p0}, Lcom/android/mltcode/paycertificationapi/b20;-><init>(Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_1
    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslViewHolder;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "<get-context>(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->setMContext(Landroid/content/Context;)V

    return-void
.end method

.method public getInitEvent()Z
    .locals 1

    iget-boolean v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->initEvent:Z

    return v0
.end method

.method public final getMContext()Landroid/content/Context;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getSportRecordData()Lcom/sma/smartv3/model/SportRecordData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    return-object v0
.end method

.method public final getSportRecordItemCommonData()Lcom/sma/smartv3/model/SportRecordItemCommonData;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->sportRecordItemCommonData:Lcom/sma/smartv3/model/SportRecordItemCommonData;

    return-object v0
.end method

.method public final getUserProfile()Lcom/sma/smartv3/model/AppUser;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->userProfile:Lcom/sma/smartv3/model/AppUser;

    return-object v0
.end method

.method public initView()V
    .locals 7

    const/16 v0, 0x14

    const/4 v1, 0x0

    invoke-static {v1, v0}, Lcom/sma/smartv3/model/SportRecordDataKt;->getSportRecordList(II)Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    iput-object v3, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    return-void

    :cond_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sma/smartv3/model/SportRecordData;

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->parseSportRecordItemCommonDataMethod()Lcom/sma/smartv3/model/SportRecordItemCommonData;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->sportRecordItemCommonData:Lcom/sma/smartv3/model/SportRecordItemCommonData;

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->sportTypeIv:Landroid/widget/ImageView;

    if-nez v0, :cond_1

    const-string v0, "sportTypeIv"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v3

    :cond_1
    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->sportRecordItemCommonData:Lcom/sma/smartv3/model/SportRecordItemCommonData;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcom/sma/smartv3/model/SportRecordItemCommonData;->getWorkoutImg()I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->sportName:Landroid/widget/TextView;

    if-nez v0, :cond_2

    const-string v0, "sportName"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v3

    :cond_2
    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->getMContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    iget-object v4, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->sportRecordItemCommonData:Lcom/sma/smartv3/model/SportRecordItemCommonData;

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-virtual {v4}, Lcom/sma/smartv3/model/SportRecordItemCommonData;->getWorkoutModeName()I

    move-result v4

    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->sportStartTimeTv:Landroid/widget/TextView;

    if-nez v0, :cond_3

    const-string v0, "sportStartTimeTv"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v3

    :cond_3
    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->sportRecordItemCommonData:Lcom/sma/smartv3/model/SportRecordItemCommonData;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/sma/smartv3/model/SportRecordItemCommonData;->getSportStartTime()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_4
    move-object v2, v3

    :goto_0
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->tvTime:Landroid/widget/TextView;

    if-nez v0, :cond_5

    const-string v0, "tvTime"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v3

    :cond_5
    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->sportRecordItemCommonData:Lcom/sma/smartv3/model/SportRecordItemCommonData;

    const-string v4, ""

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lcom/sma/smartv3/model/SportRecordItemCommonData;->getContentList()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_6

    const/4 v5, 0x1

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/model/SportRecordItemData;

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lcom/sma/smartv3/model/SportRecordItemData;->getTv()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    goto :goto_1

    :cond_6
    move-object v2, v4

    :goto_1
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->tvValue:Landroid/widget/TextView;

    if-nez v0, :cond_7

    const-string v0, "tvValue"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v3

    :cond_7
    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->sportRecordItemCommonData:Lcom/sma/smartv3/model/SportRecordItemCommonData;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Lcom/sma/smartv3/model/SportRecordItemCommonData;->getContentList()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_8

    const/4 v5, 0x2

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/model/SportRecordItemData;

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Lcom/sma/smartv3/model/SportRecordItemData;->getTv()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_8

    goto :goto_2

    :cond_8
    move-object v2, v4

    :goto_2
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->tvUnit:Landroid/widget/TextView;

    const-string v2, "tvUnit"

    if-nez v0, :cond_9

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v3

    :cond_9
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->tvUnit:Landroid/widget/TextView;

    if-nez v0, :cond_a

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object v0, v3

    :cond_a
    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Lcom/sma/smartv3/model/SportRecordData;->getMMode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    :cond_b
    if-nez v3, :cond_c

    goto :goto_3

    :cond_c
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v4, 0x8

    if-eq v2, v4, :cond_15

    :goto_3
    if-nez v3, :cond_d

    goto :goto_4

    :cond_d
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v4, 0xc

    if-ne v2, v4, :cond_e

    goto :goto_8

    :cond_e
    :goto_4
    const v2, 0x7f140d6f

    if-nez v3, :cond_f

    goto :goto_5

    :cond_f
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const/16 v5, 0x9

    if-ne v4, v5, :cond_11

    :cond_10
    move v1, v2

    goto :goto_9

    :cond_11
    :goto_5
    const v4, 0x7f140d64

    if-nez v3, :cond_12

    goto :goto_7

    :cond_12
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    const/4 v6, 0x7

    if-ne v5, v6, :cond_13

    :goto_6
    move v1, v4

    goto :goto_9

    :cond_13
    :goto_7
    if-nez v3, :cond_14

    goto :goto_9

    :cond_14
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v5, 0xa

    if-ne v3, v5, :cond_16

    sget-object v1, Lcom/szabh/smable3/component/BleCache;->INSTANCE:Lcom/szabh/smable3/component/BleCache;

    invoke-virtual {v1}, Lcom/szabh/smable3/component/BaseBleCache;->getMAGpsType()I

    move-result v1

    if-nez v1, :cond_10

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v1}, Lcom/android/mltcode/paycertificationapi/q62;->XOXOIX0Oi()Z

    move-result v1

    if-nez v1, :cond_10

    goto :goto_6

    :cond_15
    :goto_8
    const v1, 0x7f1412c6

    :cond_16
    :goto_9
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d10a2

    return v0
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

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->initView()V

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

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->initView()V

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

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->initView()V

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

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->initView()V

    return-void
.end method

.method public parseSportRecordItemCommonDataMethod()Lcom/sma/smartv3/model/SportRecordItemCommonData;
    .locals 3
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->getMContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->userProfile:Lcom/sma/smartv3/model/AppUser;

    iget-object v2, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-static {v0, v1, v2}, Lcom/sma/smartv3/model/SportRecordDataKt;->parseSportRecordItemCommonData(Landroid/content/Context;Lcom/sma/smartv3/model/AppUser;Lcom/sma/smartv3/model/SportRecordData;)Lcom/sma/smartv3/model/SportRecordItemCommonData;

    move-result-object v0

    return-object v0
.end method

.method public final setMContext(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->mContext:Landroid/content/Context;

    return-void
.end method

.method public final setSportRecordData(Lcom/sma/smartv3/model/SportRecordData;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/model/SportRecordData;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->sportRecordData:Lcom/sma/smartv3/model/SportRecordData;

    return-void
.end method

.method public final setSportRecordItemCommonData(Lcom/sma/smartv3/model/SportRecordItemCommonData;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/model/SportRecordItemCommonData;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/status/item/MainSportRecord2Item;->sportRecordItemCommonData:Lcom/sma/smartv3/model/SportRecordItemCommonData;

    return-void
.end method
