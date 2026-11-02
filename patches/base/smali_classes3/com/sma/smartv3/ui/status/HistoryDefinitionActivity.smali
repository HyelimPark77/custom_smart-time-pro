.class public final Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;
.super Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nHistoryDefinitionActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoryDefinitionActivity.kt\ncom/sma/smartv3/ui/status/HistoryDefinitionActivity\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,170:1\n37#2,2:171\n*S KotlinDebug\n*F\n+ 1 HistoryDefinitionActivity.kt\ncom/sma/smartv3/ui/status/HistoryDefinitionActivity\n*L\n79#1:171,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHistoryDefinitionActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HistoryDefinitionActivity.kt\ncom/sma/smartv3/ui/status/HistoryDefinitionActivity\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,170:1\n37#2,2:171\n*S KotlinDebug\n*F\n+ 1 HistoryDefinitionActivity.kt\ncom/sma/smartv3/ui/status/HistoryDefinitionActivity\n*L\n79#1:171,2\n*E\n"
    }
.end annotation


# instance fields
.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;-><init>()V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/IOiiX1I;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/IOiiX1I;-><init>(Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;)V

    invoke-static {v0}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public static synthetic I0iXXO(Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;->showList$lambda$0$0(Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;->showList$lambda$0$0$0(Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;->showList$lambda$0(Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X0O(Ljava/lang/String;Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;->findData$lambda$0$0(Ljava/lang/String;Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Ljava/lang/String;Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;->findData$lambda$0(Ljava/lang/String;Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private final findData()V
    .locals 7

    sget-object v0, Lcom/android/mltcode/paycertificationapi/a01;->OXO1:Lcom/android/mltcode/paycertificationapi/a01;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/a01;->IiI10X()Lcom/blankj/utilcode/util/SPUtils;

    move-result-object v0

    const-string v1, "STATUS_CARD_ORDER"

    invoke-virtual {v0, v1}, Lcom/blankj/utilcode/util/SPUtils;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    sget-object v0, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v0}, Lcom/android/mltcode/paycertificationapi/q62;->iIIIiIO0()Ljava/lang/String;

    move-result-object v0

    :cond_0
    move-object v1, v0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    const-string v0, ","

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt__StringsKt;->i1I(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/String;

    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    array-length v2, v0

    :goto_0
    if-ge v1, v2, :cond_1

    aget-object v3, v0, v1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v4

    new-instance v5, Lcom/android/mltcode/paycertificationapi/IOi0XiO;

    invoke-direct {v5, v3, p0}, Lcom/android/mltcode/paycertificationapi/IOi0XiO;-><init>(Ljava/lang/String;Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;)V

    const v3, 0x7f0d0ee5

    invoke-static {v4, v3, v5}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslAdapter()Lcom/angcyo/dsladapter/DslAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method

.method private static final findData$lambda$0(Ljava/lang/String;Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemIsHover(Z)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iXO1i;

    invoke-direct {v0, p0, p1}, Lcom/android/mltcode/paycertificationapi/iXO1i;-><init>(Ljava/lang/String;Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;)V

    invoke-virtual {p2, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    invoke-virtual {p2, p0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemTag(Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final findData$lambda$0$0(Ljava/lang/String;Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "itemHolder"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "<unused var>"

    move-object/from16 v4, p4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p5

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x7f0a0578

    invoke-virtual {v2, v3}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v3

    const v4, 0x7f0a0577

    invoke-virtual {v2, v4}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v4

    const v5, 0x7f0a09de

    invoke-virtual {v2, v5}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/view/segmentedbar/CircleThumbSegmentedBarView;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v5

    const v7, 0x7f060064

    const v8, 0x7f1401ce

    const v9, 0x7f140218

    const/high16 v10, -0x10000

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const v11, 0x7f140e19

    const v13, -0xff0100

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const v14, -0xffff01

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    const-wide/high16 v15, 0x4059000000000000L    # 100.0

    invoke-static/range {v15 .. v16}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v15

    const-wide/16 v16, 0x0

    invoke-static/range {v16 .. v17}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    const-string v12, "getString(...)"

    sparse-switch v5, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v5, "heart_rate"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    if-eqz v3, :cond_1

    const v0, 0x7f140cb6

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    if-eqz v4, :cond_2

    const v0, 0x7f140cab

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    const-wide/high16 v3, 0x404e000000000000L    # 60.0

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    const-wide v3, 0x4066800000000000L    # 180.0

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    filled-new-array {v6, v0, v15, v3}, [Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, v11}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v12}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, 0x7f140e1a

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v12}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v5, 0x7f140e18

    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v12}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {v0, v4, v5}, [Ljava/lang/String;

    move-result-object v4

    filled-new-array {v14, v13, v10}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/ArraysKt___ArraysKt;->iiIX1([Ljava/lang/Integer;)[I

    move-result-object v5

    move-object v1, v2

    const/high16 v2, 0x42a00000    # 80.0f

    move-object/from16 v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;->setBmi(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;FLjava/util/List;[Ljava/lang/String;[I)V

    goto/16 :goto_1

    :sswitch_1
    const-string v5, "blood_glucose2"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto/16 :goto_0

    :cond_3
    if-eqz v3, :cond_4

    invoke-virtual {v1, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    if-eqz v4, :cond_5

    const v0, 0x7f140ca9

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_5
    const-wide v3, 0x4018666666666666L    # 6.1

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    const-wide v3, 0x401b99999999999aL    # 6.9

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    const-wide/high16 v4, 0x4024000000000000L    # 10.0

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    filled-new-array {v6, v0, v3, v4}, [Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v12}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, 0x7f1401cf

    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v12}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v5, 0x7f1401ca

    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v12}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {v0, v4, v5}, [Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v5, 0x7f060062

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v1}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    const v7, 0x7f06005e

    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    filled-new-array {v0, v5, v6}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/ArraysKt___ArraysKt;->iiIX1([Ljava/lang/Integer;)[I

    move-result-object v5

    move-object v1, v2

    const/high16 v2, 0x40400000    # 3.0f

    move-object/from16 v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;->setBmi(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;FLjava/util/List;[Ljava/lang/String;[I)V

    goto/16 :goto_1

    :sswitch_2
    const-string v5, "blood_pressure"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto/16 :goto_0

    :cond_6
    if-eqz v3, :cond_7

    invoke-virtual {v1, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_7
    if-eqz v4, :cond_8

    const v0, 0x7f140caa

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_8
    const/4 v5, 0x1

    invoke-static {v2, v5}, Lcom/angcyo/dsladapter/LibExKt;->XX1Oi(Landroid/view/View;Z)V

    goto/16 :goto_1

    :sswitch_3
    const/4 v5, 0x1

    const-string v6, "sleep"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    goto/16 :goto_0

    :cond_9
    if-eqz v3, :cond_a

    const v0, 0x7f14125d

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_a
    invoke-static {v2, v5}, Lcom/angcyo/dsladapter/LibExKt;->XX1Oi(Landroid/view/View;Z)V

    if-eqz v4, :cond_15

    const v0, 0x7f140cae

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_1

    :sswitch_4
    const-string v5, "blood_oxygen"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    goto/16 :goto_0

    :cond_b
    if-eqz v3, :cond_c

    const v0, 0x7f14021d

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_c
    if-eqz v4, :cond_d

    const v0, 0x7f140cac

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_d
    const-wide/high16 v3, 0x4057000000000000L    # 92.0

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    filled-new-array {v6, v0, v15}, [Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, v11}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v12}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v12}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {v0, v4}, [Ljava/lang/String;

    move-result-object v4

    filled-new-array {v14, v13}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/ArraysKt___ArraysKt;->iiIX1([Ljava/lang/Integer;)[I

    move-result-object v5

    move-object v1, v2

    const/high16 v2, 0x42be0000    # 95.0f

    move-object/from16 v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;->setBmi(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;FLjava/util/List;[Ljava/lang/String;[I)V

    if-eqz v1, :cond_15

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;->setSegmentSideRule(I)V

    goto/16 :goto_1

    :sswitch_5
    move-object/from16 v18, v2

    move-object v2, v1

    move-object/from16 v1, v18

    const-string v5, "weight"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    move-object/from16 v18, v2

    move-object v2, v1

    move-object/from16 v1, v18

    goto/16 :goto_0

    :cond_e
    if-eqz v3, :cond_f

    const v0, 0x7f141500

    invoke-virtual {v2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_f
    if-eqz v4, :cond_10

    const v0, 0x7f140cb0

    invoke-virtual {v2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_10
    const-wide v3, 0x4032666666666666L    # 18.4

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    const-wide v3, 0x4038e66666666666L    # 24.9

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    const-wide v4, 0x403de66666666666L    # 29.9

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    const-wide v8, 0x4043f33333333333L    # 39.9

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    filled-new-array {v6, v0, v3, v4, v5}, [Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const v0, 0x7f141335

    invoke-virtual {v2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v12}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v4, 0x7f141021

    invoke-virtual {v2, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v12}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v5, 0x7f141356

    invoke-virtual {v2, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v12}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v6, 0x7f1402c9

    invoke-virtual {v2, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v12}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    filled-new-array {v0, v4, v5, v6}, [Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v7}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v14, v13, v0, v10}, [Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/ArraysKt___ArraysKt;->iiIX1([Ljava/lang/Integer;)[I

    move-result-object v5

    const/high16 v2, 0x41a00000    # 20.0f

    move-object/from16 v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;->setBmi(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;FLjava/util/List;[Ljava/lang/String;[I)V

    goto/16 :goto_1

    :sswitch_6
    const-string v5, "pressure"

    invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    :goto_0
    if-eqz v3, :cond_11

    const v0, 0x7f14125d

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_11
    const/4 v5, 0x1

    invoke-static {v2, v5}, Lcom/angcyo/dsladapter/LibExKt;->XX1Oi(Landroid/view/View;Z)V

    goto :goto_1

    :cond_12
    if-eqz v3, :cond_13

    const v0, 0x7f141118

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_13
    if-eqz v4, :cond_14

    const v0, 0x7f140cad

    invoke-virtual {v1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_14
    const-wide/high16 v3, 0x4039000000000000L    # 25.0

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    const-wide/high16 v3, 0x4049000000000000L    # 50.0

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    const-wide v4, 0x4052c00000000000L    # 75.0

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    filled-new-array {v6, v0, v3, v4, v15}, [Ljava/lang/Double;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->iXiX011([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v4, 0x7f03002f

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v4

    const-string v0, "getStringArray(...)"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v5, 0x7f030027

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getIntArray(I)[I

    move-result-object v5

    const-string v0, "getIntArray(...)"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, v2

    const/high16 v2, 0x41a00000    # 20.0f

    move-object/from16 v0, p1

    invoke-direct/range {v0 .. v5}, Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;->setBmi(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;FLjava/util/List;[Ljava/lang/String;[I)V

    :cond_15
    :goto_1
    sget-object v0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x4c11e9bb -> :sswitch_6
        -0x2f2ebd88 -> :sswitch_5
        -0xe5c147b -> :sswitch_4
        0x6872ed7 -> :sswitch_3
        0x21619aea -> :sswitch_2
        0x577bdaa9 -> :sswitch_1
        0x73105139 -> :sswitch_0
    .end sparse-switch
.end method

.method private final getAbhTitleCenter()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final setBmi(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;FLjava/util/List;[Ljava/lang/String;[I)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;",
            "F",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;[",
            "Ljava/lang/String;",
            "[I)V"
        }
    .end annotation

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    float-to-double v1, p2

    const/4 v6, 0x1

    move-object v0, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-static/range {v0 .. v6}, Lcom/sma/smartv3/model/WeightMeasureDataKt;->setBarView(Lcom/sma/smartv3/view/segmentedbar/SegmentedBarView;DLjava/util/List;[Ljava/lang/String;[IZ)V

    const/4 p1, 0x1

    invoke-static {v0, p1}, Lcom/angcyo/dsladapter/LibExKt;->I0XXi0X(Landroid/view/View;Z)V

    return-void
.end method

.method private final showList()V
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/Xi10XX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/Xi10XX;-><init>(Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final showList$lambda$0(Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 3

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getDslViewHolder()Lcom/angcyo/dsladapter/DslViewHolder;

    move-result-object p1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/O0iiX1O1i;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/O0iiX1O1i;-><init>(Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;)V

    const-wide/16 v1, 0x12c

    invoke-virtual {p1, v1, v2, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->postDelay(JLkotlin/jvm/functions/Function0;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showList$lambda$0$0(Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;)Lkotlin/Unit;
    .locals 1

    new-instance v0, Lcom/android/mltcode/paycertificationapi/iXXiiXIXX;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/iXXiiXIXX;-><init>(Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;)V

    invoke-virtual {p0, v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->renderAdapter(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final showList$lambda$0$0$0(Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 3

    const-string v0, "$this$renderAdapter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v1, v0}, Lcom/angcyo/dsladapter/DslAdapter;->setAdapterStatus$default(Lcom/angcyo/dsladapter/DslAdapter;ILjava/lang/Throwable;ILjava/lang/Object;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;->findData()V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public init(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    return-void
.end method

.method public initView()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->initView()V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;->getAbhTitleCenter()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f140caf

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d00b5

    return v0
.end method

.method public onInitBaseLayoutAfter()V
    .locals 2

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->onInitBaseLayoutAfter()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/status/HistoryDefinitionActivity;->showList()V

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

.method public recyclerViewId()I
    .locals 1

    const v0, 0x7f0a09c1

    return v0
.end method

.method public refreshLayoutId()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
