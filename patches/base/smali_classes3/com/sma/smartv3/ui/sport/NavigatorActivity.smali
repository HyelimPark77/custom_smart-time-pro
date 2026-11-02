.class public final Lcom/sma/smartv3/ui/sport/NavigatorActivity;
.super Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nNavigatorActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigatorActivity.kt\ncom/sma/smartv3/ui/sport/NavigatorActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,390:1\n19#2:391\n15#2:392\n1869#3,2:393\n1869#3,2:395\n*S KotlinDebug\n*F\n+ 1 NavigatorActivity.kt\ncom/sma/smartv3/ui/sport/NavigatorActivity\n*L\n58#1:391\n58#1:392\n135#1:393,2\n384#1:395,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNavigatorActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigatorActivity.kt\ncom/sma/smartv3/ui/sport/NavigatorActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,390:1\n19#2:391\n15#2:392\n1869#3,2:393\n1869#3,2:395\n*S KotlinDebug\n*F\n+ 1 NavigatorActivity.kt\ncom/sma/smartv3/ui/sport/NavigatorActivity\n*L\n58#1:391\n58#1:392\n135#1:393,2\n384#1:395,2\n*E\n"
    }
.end annotation


# instance fields
.field private final abhTitleCenter$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private final abhTitleRight$delegate:Lkotlin/Lazy;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field

.field private dataList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/NavigatorItem;",
            ">;"
        }
    .end annotation
.end field

.field private final userProfile:Lcom/sma/smartv3/model/AppUser;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 32

    move-object/from16 v0, p0

    invoke-direct {v0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;-><init>()V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/y41;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/y41;-><init>(Lcom/sma/smartv3/ui/sport/NavigatorActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    new-instance v1, Lcom/android/mltcode/paycertificationapi/z41;

    invoke-direct {v1, v0}, Lcom/android/mltcode/paycertificationapi/z41;-><init>(Lcom/sma/smartv3/ui/sport/NavigatorActivity;)V

    invoke-static {v1}, Lkotlin/LazyKt__LazyJVMKt;->iO(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

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

    iput-object v2, v0, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->dataList:Ljava/util/List;

    return-void
.end method

.method public static synthetic I0iXXO(Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/ui/sport/NavigatorActivity;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/sma/smartv3/model/NavigatorItem;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/github/mikephil/charting/charts/LineChart;Landroid/view/View;)V
    .locals 0

    invoke-static/range {p0 .. p13}, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->initItemView$lambda$3(Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/ui/sport/NavigatorActivity;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/sma/smartv3/model/NavigatorItem;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/github/mikephil/charting/charts/LineChart;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic I1XOi1(Lcom/sma/smartv3/ui/sport/NavigatorActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->findData$lambda$0$0(Lcom/sma/smartv3/ui/sport/NavigatorActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IIX1OXO(Lcom/sma/smartv3/ui/sport/NavigatorActivity;)Landroid/widget/TextView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/NavigatorActivity;)Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O10IXXX0X(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->initItemView$lambda$2(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic X0O(Lcom/sma/smartv3/ui/sport/NavigatorActivity;)Landroid/widget/ImageView;
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/NavigatorActivity;)Landroid/widget/ImageView;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X1ii(Lcom/sma/smartv3/ui/sport/NavigatorActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->findData$lambda$0$0$0(Lcom/sma/smartv3/ui/sport/NavigatorActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic XXI(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->initItemView$lambda$1(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic XiOIO(Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/ui/sport/NavigatorActivity;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/sma/smartv3/model/NavigatorItem;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/github/mikephil/charting/charts/LineChart;Landroid/view/View;)V
    .locals 0

    invoke-static/range {p0 .. p13}, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->initItemView$lambda$4(Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/ui/sport/NavigatorActivity;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/sma/smartv3/model/NavigatorItem;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/github/mikephil/charting/charts/LineChart;Landroid/view/View;)V

    return-void
.end method

.method private static final abhTitleCenter_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/NavigatorActivity;)Landroid/widget/TextView;
    .locals 1

    const v0, 0x7f0a0023

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/TextView;

    return-object p0
.end method

.method private static final abhTitleRight_delegate$lambda$0(Lcom/sma/smartv3/ui/sport/NavigatorActivity;)Landroid/widget/ImageView;
    .locals 1

    const v0, 0x7f0a0026

    invoke-virtual {p0, v0}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    move-result-object p0

    check-cast p0, Landroid/widget/ImageView;

    return-object p0
.end method

.method public static final synthetic access$findData(Lcom/sma/smartv3/ui/sport/NavigatorActivity;Lcom/angcyo/dsladapter/DslAdapter;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->findData(Lcom/angcyo/dsladapter/DslAdapter;Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic access$getDataList$p(Lcom/sma/smartv3/ui/sport/NavigatorActivity;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->dataList:Ljava/util/List;

    return-object p0
.end method

.method public static final synthetic access$getUserProfile$p(Lcom/sma/smartv3/ui/sport/NavigatorActivity;)Lcom/sma/smartv3/model/AppUser;
    .locals 0

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->userProfile:Lcom/sma/smartv3/model/AppUser;

    return-object p0
.end method

.method public static final synthetic access$setDataList$p(Lcom/sma/smartv3/ui/sport/NavigatorActivity;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->dataList:Ljava/util/List;

    return-void
.end method

.method public static final synthetic access$showData(Lcom/sma/smartv3/ui/sport/NavigatorActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->showData()V

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
            "Lcom/sma/smartv3/model/NavigatorItem;",
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

    check-cast v0, Lcom/sma/smartv3/model/NavigatorItem;

    new-instance v0, Lcom/android/mltcode/paycertificationapi/f51;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/f51;-><init>(Lcom/sma/smartv3/ui/sport/NavigatorActivity;)V

    const v1, 0x7f0d0f22

    invoke-static {p1, v1, v0}, Lcom/angcyo/dsladapter/DslAdapterExKt;->O10IXXX0X(Lcom/angcyo/dsladapter/DslAdapter;ILkotlin/jvm/functions/Function1;)Lcom/angcyo/dsladapter/DslAdapterItem;

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static final findData$lambda$0$0(Lcom/sma/smartv3/ui/sport/NavigatorActivity;Lcom/angcyo/dsladapter/DslAdapterItem;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$dslItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/android/mltcode/paycertificationapi/a51;

    invoke-direct {v0, p0}, Lcom/android/mltcode/paycertificationapi/a51;-><init>(Lcom/sma/smartv3/ui/sport/NavigatorActivity;)V

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemBindOverride(Lkotlin/jvm/functions/Function4;)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final findData$lambda$0$0$0(Lcom/sma/smartv3/ui/sport/NavigatorActivity;Lcom/angcyo/dsladapter/DslViewHolder;ILcom/angcyo/dsladapter/DslAdapterItem;Ljava/util/List;)Lkotlin/Unit;
    .locals 1

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "<unused var>"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->initItemView(Lcom/angcyo/dsladapter/DslViewHolder;I)V

    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private final getAbhTitleCenter()Landroid/widget/TextView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->abhTitleCenter$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    return-object v0
.end method

.method private final getAbhTitleRight()Landroid/widget/ImageView;
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->abhTitleRight$delegate:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    return-object v0
.end method

.method private final initItemView(Lcom/angcyo/dsladapter/DslViewHolder;I)V
    .locals 20

    move-object/from16 v2, p0

    move-object/from16 v0, p1

    iget-object v1, v2, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->dataList:Ljava/util/List;

    move/from16 v3, p2

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lcom/sma/smartv3/model/NavigatorItem;

    invoke-virtual {v11}, Lcom/sma/smartv3/model/NavigatorItem;->getMLastWorkout()Lcom/sma/smartv3/db/entity/Workout;

    move-result-object v7

    sget-object v1, Lcom/android/mltcode/paycertificationapi/q62;->OXO1:Lcom/android/mltcode/paycertificationapi/q62;

    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v3

    invoke-virtual {v1, v3}, Lcom/android/mltcode/paycertificationapi/q62;->i01OOiI(I)Ljava/lang/String;

    move-result-object v1

    const v3, 0x7f0a05c6

    invoke-virtual {v0, v3}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    const v3, 0x7f0a05b3

    invoke-virtual {v0, v3}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v11}, Lcom/sma/smartv3/model/NavigatorItem;->getMLeadingNum()I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    const v3, 0x7f0a058f

    invoke-virtual {v0, v3}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v11}, Lcom/sma/smartv3/model/NavigatorItem;->getMFlatNum()I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    const v3, 0x7f0a0568

    invoke-virtual {v0, v3}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v11}, Lcom/sma/smartv3/model/NavigatorItem;->getMBackWard()I

    move-result v4

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    const v3, 0x7f0a0990

    invoke-virtual {v0, v3}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    const v1, 0x7f0a098e

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->img(I)Landroid/widget/ImageView;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v3

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const-string v5, "getContext(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lcom/sma/smartv3/model/SportRecordData;

    invoke-direct {v5}, Lcom/sma/smartv3/model/SportRecordData;-><init>()V

    invoke-virtual {v7}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v6

    invoke-virtual {v5, v6}, Lcom/sma/smartv3/model/SportRecordData;->setMMode(I)V

    sget-object v6, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    invoke-static {v4, v5}, Lcom/sma/smartv3/model/SportRecordDataKt;->getWorkoutImage(Landroid/content/Context;Lcom/sma/smartv3/model/SportRecordData;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Integer;)Lcom/bumptech/glide/RequestBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/bumptech/glide/RequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/ViewTarget;

    :cond_5
    const v1, 0x7f0a05c1

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_6

    new-instance v3, Lcom/android/mltcode/paycertificationapi/b51;

    invoke-direct {v3}, Lcom/android/mltcode/paycertificationapi/b51;-><init>()V

    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_6
    const v1, 0x7f0a05b0

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_7

    new-instance v3, Lcom/android/mltcode/paycertificationapi/c51;

    invoke-direct {v3}, Lcom/android/mltcode/paycertificationapi/c51;-><init>()V

    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_7
    const v1, 0x7f0a05b2

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Landroid/widget/TextView;

    const v1, 0x7f0a058e

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v1

    move-object v13, v1

    check-cast v13, Landroid/widget/TextView;

    const v1, 0x7f0a0567

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v1

    move-object v14, v1

    check-cast v14, Landroid/widget/TextView;

    const v1, 0x7f0a05be

    invoke-virtual {v0, v1}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const v3, 0x7f0a05bf

    invoke-virtual {v0, v3}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    const v4, 0x7f0a05bd

    invoke-virtual {v0, v4}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    const v5, 0x7f0a05bb

    invoke-virtual {v0, v5}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    const v6, 0x7f0a05bc

    invoke-virtual {v0, v6}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v6

    check-cast v6, Landroid/widget/TextView;

    const v8, 0x7f0a06ab

    invoke-virtual {v0, v8}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v8

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast v8, Lcom/github/mikephil/charting/charts/LineChart;

    sget-object v15, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->OXO1:Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;

    move-object v9, v1

    invoke-virtual {v15, v8, v2}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->XO0O10(Lcom/github/mikephil/charting/charts/LineChart;Landroid/content/Context;)[Ljava/lang/String;

    move-result-object v1

    const v10, 0x7f0a05f1

    invoke-virtual {v0, v10}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v10

    move-object/from16 v16, v10

    check-cast v16, Landroid/widget/TextView;

    const v10, 0x7f0a05e3

    invoke-virtual {v0, v10}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object v0

    move-object/from16 v17, v0

    check-cast v17, Landroid/widget/TextView;

    move-object v10, v6

    new-instance v6, Lkotlin/jvm/internal/Ref$IntRef;

    invoke-direct {v6}, Lkotlin/jvm/internal/Ref$IntRef;-><init>()V

    if-eqz v3, :cond_8

    const-string v0, ""

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_8
    new-instance v0, Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;

    move-object/from16 v19, v3

    move-object v3, v2

    move-object v2, v9

    move-object v9, v5

    move-object/from16 v5, v19

    move-object/from16 v19, v8

    move-object v8, v4

    move-object/from16 v4, v19

    invoke-direct/range {v0 .. v10}, Lcom/sma/smartv3/ui/sport/NavigatorActivity$OXO1;-><init>([Ljava/lang/String;Landroid/widget/TextView;Lcom/sma/smartv3/ui/sport/NavigatorActivity;Lcom/github/mikephil/charting/charts/LineChart;Landroid/widget/TextView;Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/db/entity/Workout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    move-object v2, v6

    move-object v6, v0

    move-object v0, v9

    move-object v9, v5

    move-object v5, v2

    move-object v2, v3

    move-object/from16 v18, v7

    move-object v3, v1

    move-object v1, v10

    move-object v10, v8

    invoke-virtual {v4, v6}, Lcom/github/mikephil/charting/charts/Chart;->setOnChartValueSelectedListener(Lcom/android/mltcode/paycertificationapi/uf1;)V

    invoke-direct {v2, v9, v10, v0, v1}, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->setMonthSelectedType(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    move-object v6, v1

    iget v1, v5, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    move-object v7, v11

    move-object v11, v0

    move-object v0, v2

    move-object v2, v7

    move-object v7, v13

    move-object v13, v5

    move-object v5, v12

    move-object v12, v6

    move-object v6, v7

    move-object v8, v4

    move-object v7, v14

    move-object/from16 v4, v17

    move-object v14, v3

    move-object/from16 v3, v16

    invoke-direct/range {v0 .. v8}, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->setSelectedMonthData(ILcom/sma/smartv3/model/NavigatorItem;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/github/mikephil/charting/charts/LineChart;)V

    move-object v0, v4

    move-object v1, v7

    move-object v4, v8

    move-object v7, v2

    move-object v8, v3

    if-eqz v8, :cond_9

    move-object v3, v9

    move-object v9, v0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/d51;

    move-object v2, v12

    move-object v12, v1

    move-object v1, v13

    move-object v13, v4

    move-object v4, v10

    move-object v10, v5

    move-object v5, v11

    move-object v11, v6

    move-object v6, v2

    move-object/from16 v2, p0

    invoke-direct/range {v0 .. v13}, Lcom/android/mltcode/paycertificationapi/d51;-><init>(Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/ui/sport/NavigatorActivity;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/sma/smartv3/model/NavigatorItem;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/github/mikephil/charting/charts/LineChart;)V

    move-object v2, v0

    move-object v0, v5

    move-object v5, v10

    move-object v10, v6

    move-object v6, v11

    invoke-virtual {v8, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0

    :cond_9
    move-object v3, v12

    move-object v12, v1

    move-object v1, v13

    move-object v13, v4

    move-object v4, v10

    move-object v10, v3

    move-object v3, v9

    move-object v9, v0

    move-object v0, v11

    :goto_0
    if-eqz v9, :cond_a

    move-object v11, v0

    new-instance v0, Lcom/android/mltcode/paycertificationapi/e51;

    move-object v2, v10

    move-object v10, v5

    move-object v5, v11

    move-object v11, v6

    move-object v6, v2

    move-object/from16 v2, p0

    invoke-direct/range {v0 .. v13}, Lcom/android/mltcode/paycertificationapi/e51;-><init>(Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/ui/sport/NavigatorActivity;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/sma/smartv3/model/NavigatorItem;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/github/mikephil/charting/charts/LineChart;)V

    invoke-virtual {v9, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_1

    :cond_a
    move-object/from16 v2, p0

    :goto_1
    invoke-virtual/range {v18 .. v18}, Lcom/sma/smartv3/db/entity/Workout;->getMMode()I

    move-result v0

    const/16 v3, 0xa

    const/4 v4, 0x0

    if-ne v0, v3, :cond_c

    if-eqz v9, :cond_b

    const v0, 0x7f141287

    invoke-virtual {v2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_b
    invoke-virtual {v13}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/github/mikephil/charting/components/YAxis;->X1OI(Z)V

    invoke-virtual {v13}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v0

    new-instance v3, Lcom/sma/smartv3/ui/sport/NavigatorActivity$XIi00iiXO;

    invoke-direct {v3, v1}, Lcom/sma/smartv3/ui/sport/NavigatorActivity$XIi00iiXO;-><init>(Lkotlin/jvm/internal/Ref$IntRef;)V

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Oi(Lcom/android/mltcode/paycertificationapi/he6;)V

    goto :goto_2

    :cond_c
    if-eqz v9, :cond_d

    const v0, 0x7f14108b

    invoke-virtual {v2, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v9, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_d
    invoke-virtual {v13}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v0

    iget v3, v1, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    if-eqz v3, :cond_e

    const/4 v4, 0x1

    :cond_e
    invoke-virtual {v0, v4}, Lcom/github/mikephil/charting/components/YAxis;->X1OI(Z)V

    invoke-virtual {v13}, Lcom/github/mikephil/charting/charts/BarLineChartBase;->getAxisLeft()Lcom/github/mikephil/charting/components/YAxis;

    move-result-object v0

    new-instance v3, Lcom/sma/smartv3/ui/sport/NavigatorActivity$iO;

    invoke-direct {v3, v1, v2}, Lcom/sma/smartv3/ui/sport/NavigatorActivity$iO;-><init>(Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/ui/sport/NavigatorActivity;)V

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/IIIi10O1;->Oi(Lcom/android/mltcode/paycertificationapi/he6;)V

    :goto_2
    invoke-virtual {v15, v13, v14}, Lcom/android/mltcode/paycertificationapi/iO1Xi1X1i;->O00(Lcom/github/mikephil/charting/charts/LineChart;[Ljava/lang/String;)V

    return-void
.end method

.method private static final initItemView$lambda$1(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method private static final initItemView$lambda$2(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method private static final initItemView$lambda$3(Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/ui/sport/NavigatorActivity;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/sma/smartv3/model/NavigatorItem;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/github/mikephil/charting/charts/LineChart;Landroid/view/View;)V
    .locals 0

    const/4 p13, 0x0

    iput p13, p0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-direct {p1, p2, p3, p4, p5}, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->setMonthSelectedType(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    iget p0, p0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    move-object p2, p1

    move p1, p0

    move-object p0, p2

    move-object p2, p6

    move-object p3, p7

    move-object p4, p8

    move-object p5, p9

    move-object p6, p10

    move-object p7, p11

    move-object p8, p12

    invoke-direct/range {p0 .. p8}, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->setSelectedMonthData(ILcom/sma/smartv3/model/NavigatorItem;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/github/mikephil/charting/charts/LineChart;)V

    return-void
.end method

.method private static final initItemView$lambda$4(Lkotlin/jvm/internal/Ref$IntRef;Lcom/sma/smartv3/ui/sport/NavigatorActivity;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/sma/smartv3/model/NavigatorItem;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/github/mikephil/charting/charts/LineChart;Landroid/view/View;)V
    .locals 0

    const/4 p13, 0x1

    iput p13, p0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    invoke-direct {p1, p2, p3, p4, p5}, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->setMonthSelectedType(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    iget p0, p0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    move-object p2, p1

    move p1, p0

    move-object p0, p2

    move-object p2, p6

    move-object p3, p7

    move-object p4, p8

    move-object p5, p9

    move-object p6, p10

    move-object p7, p11

    move-object p8, p12

    invoke-direct/range {p0 .. p8}, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->setSelectedMonthData(ILcom/sma/smartv3/model/NavigatorItem;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/github/mikephil/charting/charts/LineChart;)V

    return-void
.end method

.method private final setMonthSelectedType(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V
    .locals 4

    const-string p1, ":"

    const v0, 0x7f1403bc

    if-eqz p2, :cond_0

    const v1, 0x7f140c5d

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    if-eqz p3, :cond_1

    const p2, 0x7f14006f

    invoke-virtual {p0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    if-eqz p4, :cond_2

    const p2, 0x7f140463

    invoke-virtual {p0, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_2
    return-void
.end method

.method private final setSelectedMonthData(ILcom/sma/smartv3/model/NavigatorItem;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Lcom/github/mikephil/charting/charts/LineChart;)V
    .locals 3

    invoke-virtual {p2}, Lcom/sma/smartv3/model/NavigatorItem;->getMNavigatorMoonItem()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sma/smartv3/model/NavigatorMoonItem;

    const v0, 0x7f0816cc

    if-eqz p3, :cond_0

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {p3, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    const v1, 0x7f06074b

    if-eqz p3, :cond_1

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v2

    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v2

    invoke-virtual {p3, v2}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_1
    if-eqz p4, :cond_2

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v2

    invoke-static {v2, v0}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p4, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_2
    if-eqz p4, :cond_3

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0, v1}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v0

    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {p4, v0}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_3
    if-eqz p5, :cond_4

    invoke-virtual {p2}, Lcom/sma/smartv3/model/NavigatorMoonItem;->getMLeadingNum()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_4
    if-eqz p6, :cond_5

    invoke-virtual {p2}, Lcom/sma/smartv3/model/NavigatorMoonItem;->getMFlatNum()I

    move-result p5

    invoke-static {p5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p6, p5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_5
    if-eqz p7, :cond_6

    invoke-virtual {p2}, Lcom/sma/smartv3/model/NavigatorMoonItem;->getMBackWard()I

    move-result p5

    invoke-static {p5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p5

    invoke-virtual {p7, p5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_6
    const p5, 0x7f06024c

    const p6, 0x7f0816de

    if-eqz p1, :cond_a

    const/4 p3, 0x1

    if-eq p1, p3, :cond_7

    return-void

    :cond_7
    if-eqz p4, :cond_8

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p1

    invoke-static {p1, p6}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p4, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_8
    if-eqz p4, :cond_9

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p1

    invoke-static {p1, p5}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p4, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_9
    invoke-direct {p0, p8, p2}, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->updateLineChartData(Lcom/github/mikephil/charting/charts/LineChart;Lcom/sma/smartv3/model/NavigatorMoonItem;)V

    return-void

    :cond_a
    if-eqz p3, :cond_b

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p1

    invoke-static {p1, p6}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_b
    if-eqz p3, :cond_c

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object p1

    invoke-static {p1, p5}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result p1

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    :cond_c
    invoke-direct {p0, p8, p2}, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->updateLineChartData(Lcom/github/mikephil/charting/charts/LineChart;Lcom/sma/smartv3/model/NavigatorMoonItem;)V

    return-void
.end method

.method private final showData()V
    .locals 6

    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v0

    new-instance v3, Lcom/sma/smartv3/ui/sport/NavigatorActivity$showData$1;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, Lcom/sma/smartv3/ui/sport/NavigatorActivity$showData$1;-><init>(Lcom/sma/smartv3/ui/sport/NavigatorActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

    return-void
.end method

.method private final updateLineChartData(Lcom/github/mikephil/charting/charts/LineChart;Lcom/sma/smartv3/model/NavigatorMoonItem;)V
    .locals 10

    new-instance v0, Lcom/github/mikephil/charting/data/LineDataSet;

    invoke-virtual {p2}, Lcom/sma/smartv3/model/NavigatorMoonItem;->getMTarget()Ljava/util/List;

    move-result-object v1

    const v2, 0x7f140c5d

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/github/mikephil/charting/data/LineDataSet;-><init>(Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    const v2, 0x7f060537

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->II1(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/data/LineDataSet;->I00(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v1

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/github/mikephil/charting/data/LineDataSet;->IIX(I)V

    const/high16 v1, 0x40400000    # 3.0f

    invoke-virtual {v0, v1}, Lcom/android/mltcode/paycertificationapi/ho;->I1XII0X(F)V

    const/high16 v2, 0x40000000    # 2.0f

    invoke-virtual {v0, v2}, Lcom/github/mikephil/charting/data/LineDataSet;->iXOII(F)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->I1(Z)V

    const/4 v4, 0x1

    invoke-virtual {v0, v4}, Lcom/github/mikephil/charting/data/LineDataSet;->OXOO0X0i(Z)V

    const/high16 v5, 0x40800000    # 4.0f

    invoke-virtual {v0, v5}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->I1XOi1(F)V

    sget-object v6, Lcom/github/mikephil/charting/data/LineDataSet$Mode;->CUBIC_BEZIER:Lcom/github/mikephil/charting/data/LineDataSet$Mode;

    invoke-virtual {v0, v6}, Lcom/github/mikephil/charting/data/LineDataSet;->OXXO0O1X(Lcom/github/mikephil/charting/data/LineDataSet$Mode;)V

    new-instance v7, Lcom/github/mikephil/charting/data/LineDataSet;

    invoke-virtual {p2}, Lcom/sma/smartv3/model/NavigatorMoonItem;->getMActual()Ljava/util/List;

    move-result-object v8

    const v9, 0x7f14006f

    invoke-virtual {p0, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    invoke-direct {v7, v8, v9}, Lcom/github/mikephil/charting/data/LineDataSet;-><init>(Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v8

    const v9, 0x7f06022a

    invoke-static {v8, v9}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v8

    invoke-virtual {v7, v8}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->II1(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v8

    invoke-static {v8, v9}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v8

    invoke-virtual {v7, v8}, Lcom/github/mikephil/charting/data/LineDataSet;->I00(I)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMContext()Landroid/app/Activity;

    move-result-object v8

    invoke-static {v8, v9}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v8

    invoke-virtual {v7, v8}, Lcom/github/mikephil/charting/data/LineDataSet;->IIX(I)V

    invoke-virtual {v7, v1}, Lcom/android/mltcode/paycertificationapi/ho;->I1XII0X(F)V

    invoke-virtual {v7, v2}, Lcom/github/mikephil/charting/data/LineDataSet;->iXOII(F)V

    invoke-virtual {v7, v3}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->I1(Z)V

    invoke-virtual {v7, v4}, Lcom/github/mikephil/charting/data/LineDataSet;->OXOO0X0i(Z)V

    invoke-virtual {v7, v5}, Lcom/android/mltcode/paycertificationapi/iO101O0XI;->I1XOi1(F)V

    invoke-virtual {v7, v6}, Lcom/github/mikephil/charting/data/LineDataSet;->OXXO0O1X(Lcom/github/mikephil/charting/data/LineDataSet$Mode;)V

    new-instance v1, Lcom/android/mltcode/paycertificationapi/co;

    const/4 v2, 0x2

    new-array v2, v2, [Lcom/android/mltcode/paycertificationapi/IiXO1XOi;

    aput-object v0, v2, v3

    aput-object v7, v2, v4

    invoke-direct {v1, v2}, Lcom/android/mltcode/paycertificationapi/co;-><init>([Lcom/android/mltcode/paycertificationapi/IiXO1XOi;)V

    invoke-virtual {p1, v1}, Lcom/github/mikephil/charting/charts/Chart;->setData(Lcom/android/mltcode/paycertificationapi/XOi0;)V

    invoke-virtual {p1}, Lcom/github/mikephil/charting/charts/Chart;->getLegend()Lcom/github/mikephil/charting/components/Legend;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/android/mltcode/paycertificationapi/OIi0Oi;->XOO0ii0(Z)V

    invoke-virtual {p2}, Lcom/sma/smartv3/model/NavigatorMoonItem;->getMTarget()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    const/4 v0, 0x0

    move v1, v0

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/github/mikephil/charting/data/Entry;

    invoke-virtual {v2}, Lcom/android/mltcode/paycertificationapi/iII0X010;->O00()F

    move-result v4

    cmpl-float v4, v4, v0

    if-lez v4, :cond_0

    invoke-virtual {v2}, Lcom/github/mikephil/charting/data/Entry;->OIX0iXi()F

    move-result v1

    goto :goto_0

    :cond_1
    invoke-virtual {p1, v1, v3}, Lcom/github/mikephil/charting/charts/Chart;->II1Xi0(FI)V

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method


# virtual methods
.method public final formatMonthDay(Ljava/lang/String;)Ljava/lang/String;
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "dateStr"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    const/4 v2, 0x2

    invoke-virtual {p1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v2, "substring(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x3

    invoke-virtual {p1, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const v1, 0x7f140f76

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    const v2, 0x7f1403c8

    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method

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

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->getAbhTitleCenter()Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f1412a4

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0115

    return v0
.end method

.method public onInitBaseLayoutAfter()V
    .locals 9

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->onInitBaseLayoutAfter()V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-direct {v1, p0}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    invoke-virtual {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    new-instance v1, Lcom/sma/smartv3/util/DeviceItemDecoration;

    const/high16 v2, 0x41800000    # 16.0f

    invoke-static {v2}, Lcom/blankj/utilcode/util/SizeUtils;->dp2px(F)I

    move-result v2

    const/16 v7, 0x1e

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lcom/sma/smartv3/util/DeviceItemDecoration;-><init>(IZZIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    invoke-direct {p0}, Lcom/sma/smartv3/ui/sport/NavigatorActivity;->showData()V

    return-void
.end method

.method public onRefresh()V
    .locals 6

    invoke-super {p0}, Lcom/bestmafen/androidbase/recycler/BaseDSLRecyclerActivity;->onRefresh()V

    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v0

    new-instance v3, Lcom/sma/smartv3/ui/sport/NavigatorActivity$onRefresh$1;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, Lcom/sma/smartv3/ui/sport/NavigatorActivity$onRefresh$1;-><init>(Lcom/sma/smartv3/ui/sport/NavigatorActivity;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lcom/android/mltcode/paycertificationapi/I100X1;->O00(Lcom/android/mltcode/paycertificationapi/i00OIXiO;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/XiOIO;

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

.method public final onTitleRightClick(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

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
