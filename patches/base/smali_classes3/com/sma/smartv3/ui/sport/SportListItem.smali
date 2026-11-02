.class public final Lcom/sma/smartv3/ui/sport/SportListItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSportListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportListItem.kt\ncom/sma/smartv3/ui/sport/SportListItem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,71:1\n1869#2,2:72\n*S KotlinDebug\n*F\n+ 1 SportListItem.kt\ncom/sma/smartv3/ui/sport/SportListItem\n*L\n31#1:72,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSportListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportListItem.kt\ncom/sma/smartv3/ui/sport/SportListItem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,71:1\n1869#2,2:72\n*S KotlinDebug\n*F\n+ 1 SportListItem.kt\ncom/sma/smartv3/ui/sport/SportListItem\n*L\n31#1:72,2\n*E\n"
    }
.end annotation


# instance fields
.field private sportItemClick:Lkotlin/jvm/functions/Function1;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final sportList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final title:Ljava/lang/String;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sportList"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportListItem;->title:Ljava/lang/String;

    iput-object p2, p0, Lcom/sma/smartv3/ui/sport/SportListItem;->sportList:Ljava/util/List;

    return-void
.end method

.method public static synthetic IiI10X(Lcom/sma/smartv3/ui/sport/SportListItem;Lcom/angcyo/dsladapter/DslViewHolder;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/SportListItem;->bindView$lambda$1$0$0(Lcom/sma/smartv3/ui/sport/SportListItem;Lcom/angcyo/dsladapter/DslViewHolder;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O00(Lcom/sma/smartv3/ui/sport/SportListItem;ILandroid/view/View;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/sma/smartv3/ui/sport/SportListItem;->bindView$lambda$1$0$0$0$2$0(Lcom/sma/smartv3/ui/sport/SportListItem;ILandroid/view/View;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final bindView$lambda$1$0$0(Lcom/sma/smartv3/ui/sport/SportListItem;Lcom/angcyo/dsladapter/DslViewHolder;Lcom/angcyo/dsladapter/DslAdapter;)Lkotlin/Unit;
    .locals 5

    const-string v0, "$this$render"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportListItem;->sportList:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslViewHolder;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "<get-context>(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lcom/sma/smartv3/model/SportRecordData;

    invoke-direct {v4}, Lcom/sma/smartv3/model/SportRecordData;-><init>()V

    invoke-virtual {v4, v1}, Lcom/sma/smartv3/model/SportRecordData;->setMMode(I)V

    invoke-static {v2, v4}, Lcom/sma/smartv3/model/SportRecordDataKt;->getWorkoutImage(Landroid/content/Context;Lcom/sma/smartv3/model/SportRecordData;)I

    move-result v2

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslViewHolder;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lcom/sma/smartv3/model/SportRecordData;

    invoke-direct {v3}, Lcom/sma/smartv3/model/SportRecordData;-><init>()V

    invoke-virtual {v3, v1}, Lcom/sma/smartv3/model/SportRecordData;->setMMode(I)V

    invoke-static {v4, v3}, Lcom/sma/smartv3/model/SportRecordDataKt;->getWorkoutName(Landroid/content/Context;Lcom/sma/smartv3/model/SportRecordData;)I

    move-result v3

    new-instance v4, Lcom/sma/smartv3/ui/sport/SportListInfoItem;

    invoke-direct {v4, v1, v2, v3}, Lcom/sma/smartv3/ui/sport/SportListInfoItem;-><init>(III)V

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p2, v4, v3, v2, v3}, Lcom/angcyo/dsladapter/DslAdapterExKt;->IIX1OXO(Lcom/angcyo/dsladapter/DslAdapter;Lcom/angcyo/dsladapter/DslAdapterItem;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/angcyo/dsladapter/DslAdapterItem;

    move-result-object v2

    check-cast v2, Lcom/sma/smartv3/ui/sport/SportListInfoItem;

    new-instance v3, Lcom/android/mltcode/paycertificationapi/h05;

    invoke-direct {v3, p0, v1}, Lcom/android/mltcode/paycertificationapi/h05;-><init>(Lcom/sma/smartv3/ui/sport/SportListItem;I)V

    invoke-virtual {v2, v3}, Lcom/angcyo/dsladapter/DslAdapterItem;->setItemClick(Lkotlin/jvm/functions/Function1;)V

    goto :goto_0

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method

.method private static final bindView$lambda$1$0$0$0$2$0(Lcom/sma/smartv3/ui/sport/SportListItem;ILandroid/view/View;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/sma/smartv3/ui/sport/SportListItem;->sportItemClick:Lkotlin/jvm/functions/Function1;

    if-eqz p0, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Lkotlin/Unit;->OXO1:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 12
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a1897

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->tv(I)Landroid/widget/TextView;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/SportListItem;->title:Ljava/lang/String;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Lcom/sma/smartv3/util/UtilsKt;->iii0(Z)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v2, p0, Lcom/sma/smartv3/ui/sport/SportListItem;->title:Ljava/lang/String;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    const v0, 0x7f0a0996

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->rv(I)Landroidx/recyclerview/widget/RecyclerView;

    move-result-object v0

    if-eqz v0, :cond_2

    const/16 v2, 0x64

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setItemViewCacheSize(I)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;)V

    new-instance v3, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-virtual {p1}, Lcom/angcyo/dsladapter/DslViewHolder;->getContext()Landroid/content/Context;

    move-result-object v4

    const/4 v5, 0x2

    invoke-direct {v3, v4, v5}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    new-instance v6, Lcom/angcyo/dsladapter/DslAdapter;

    invoke-direct {v6, v2, v1, v2}, Lcom/angcyo/dsladapter/DslAdapter;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v6}, Lcom/angcyo/dsladapter/DslAdapter;->clearAllItems()V

    new-instance v9, Lcom/android/mltcode/paycertificationapi/g05;

    invoke-direct {v9, p0, p1}, Lcom/android/mltcode/paycertificationapi/g05;-><init>(Lcom/sma/smartv3/ui/sport/SportListItem;Lcom/angcyo/dsladapter/DslViewHolder;)V

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, Lcom/angcyo/dsladapter/DslAdapter;->render$default(Lcom/angcyo/dsladapter/DslAdapter;ZLcom/angcyo/dsladapter/XIi00iiXO;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    invoke-virtual {v0, v6}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    :cond_2
    return-void
.end method

.method public final getSportItemClick()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportListItem;->sportItemClick:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getSportList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportListItem;->sportList:Ljava/util/List;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/sport/SportListItem;->title:Ljava/lang/String;

    return-object v0
.end method

.method public initView()V
    .locals 0

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d1066

    return v0
.end method

.method public final setSportItemClick(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/sport/SportListItem;->sportItemClick:Lkotlin/jvm/functions/Function1;

    return-void
.end method
