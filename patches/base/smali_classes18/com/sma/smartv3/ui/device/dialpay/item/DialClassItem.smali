.class public final Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;
.super Lcom/bestmafen/androidbase/dsl/BaseDslItem;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem$OXO1;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDialClassItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialClassItem.kt\ncom/sma/smartv3/ui/device/dialpay/item/DialClassItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nDialClassItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialClassItem.kt\ncom/sma/smartv3/ui/device/dialpay/item/DialClassItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"
    }
.end annotation


# instance fields
.field private final categorys:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/OnlineWatchFaceV2;",
            ">;"
        }
    .end annotation
.end field

.field public mContext:Landroid/content/Context;

.field private mOnItemClickListener:Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem$OXO1;
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation
.end field

.field private mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/OnlineWatchFaceV2;",
            ">;)V"
        }
    .end annotation

    const-string v0, "categorys"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/bestmafen/androidbase/dsl/BaseDslItem;-><init>()V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;->categorys:Ljava/util/List;

    return-void
.end method

.method public static final synthetic access$onAdapterClick(Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;I)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;->onAdapterClick(I)V

    return-void
.end method

.method private final onAdapterClick(I)V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;->mOnItemClickListener:Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem$OXO1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem$OXO1;->OXO1(I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public bindView(Lcom/angcyo/dsladapter/DslViewHolder;)V
    .locals 5
    .param p1    # Lcom/angcyo/dsladapter/DslViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "itemHolder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0a0865

    invoke-virtual {p1, v0}, Lcom/angcyo/dsladapter/DslViewHolder;->v(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->XXI(Ljava/lang/Object;)V

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    const/4 v0, 0x0

    const-string v1, "mRecyclerView"

    if-nez p1, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v2, "getContext(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;->setMContext(Landroid/content/Context;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-nez p1, :cond_1

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    move-object p1, v0

    :cond_1
    new-instance v2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;->getMContext()Landroid/content/Context;

    move-result-object v3

    const/4 v4, 0x0

    invoke-direct {v2, v3, v4, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;IZ)V

    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;->categorys:Ljava/util/List;

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {p0}, Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;->getMContext()Landroid/content/Context;

    move-result-object p1

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;->categorys:Ljava/util/List;

    new-instance v3, Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem$bindView$mAdapter$1;

    invoke-direct {v3, p0, p1, v2}, Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem$bindView$mAdapter$1;-><init>(Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;Landroid/content/Context;Ljava/util/List;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;->mRecyclerView:Landroidx/recyclerview/widget/RecyclerView;

    if-nez p1, :cond_2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v0, p1

    :goto_0
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    :cond_3
    return-void
.end method

.method public final getCategorys()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/model/OnlineWatchFaceV2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;->categorys:Ljava/util/List;

    return-object v0
.end method

.method public final getMContext()Landroid/content/Context;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;->mContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "mContext"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->XXO(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getMOnItemClickListener()Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem$OXO1;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;->mOnItemClickListener:Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem$OXO1;

    return-object v0
.end method

.method public initView()V
    .locals 0

    return-void
.end method

.method public layoutId()I
    .locals 1

    const v0, 0x7f0d0f57

    return v0
.end method

.method public final setMContext(Landroid/content/Context;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;->mContext:Landroid/content/Context;

    return-void
.end method

.method public final setMOnItemClickListener(Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem$OXO1;)V
    .locals 0
    .param p1    # Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem$OXO1;
        .annotation build Lcom/android/mltcode/paycertificationapi/tb1;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;->mOnItemClickListener:Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem$OXO1;

    return-void
.end method

.method public final setOnItemClickListener(Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem$OXO1;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem$OXO1;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem;->mOnItemClickListener:Lcom/sma/smartv3/ui/device/dialpay/item/DialClassItem$OXO1;

    return-void
.end method
