.class public final Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;
.super Landroidx/recyclerview/widget/RecyclerView$Adapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter$ChatVoiceFromViewHolder;,
        Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter$ChatVoiceToViewHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/recyclerview/widget/RecyclerView$Adapter<",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        ">;"
    }
.end annotation


# instance fields
.field private final dataList:Ljava/util/List;
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;->dataList:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final add(Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;)V
    .locals 1
    .param p1    # Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;->dataList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;->dataList:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    return-void
.end method

.method public final addOrUpdateStream(Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;)V
    .locals 11
    .param p1    # Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;->dataList:Ljava/util/List;

    invoke-static {v0}, Lkotlin/collections/CollectionsKt__CollectionsKt;->X11iII1O1(Ljava/util/List;)I

    move-result v0

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;->dataList:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;->dataList:Ljava/util/List;

    invoke-static {v1}, Lkotlin/collections/CollectionsKt___CollectionsKt;->Xi1XO00(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;

    invoke-virtual {v1}, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->isEnded()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;->dataList:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->getData()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->getEnded()I

    move-result v7

    const/16 v9, 0x2d

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v10}, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->copy$default(Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;ILjava/lang/String;Lcom/sma/smartv3/dto/FunctionType;Lcom/sma/smartv3/dto/ChatAiMode;ILcom/sma/smartv3/dto/ChatShowType;ILjava/lang/Object;)Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;

    move-result-object p1

    iget-object v1, p0, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;->dataList:Ljava/util/List;

    invoke-interface {v1, v0, p1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemChanged(I)V

    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;->dataList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;->dataList:Ljava/util/List;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt__CollectionsKt;->X11iII1O1(Ljava/util/List;)I

    move-result p1

    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyItemInserted(I)V

    return-void
.end method

.method public final getDataList()Ljava/util/List;
    .locals 1
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;->dataList:Ljava/util/List;

    return-object v0
.end method

.method public getItemCount()I
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;->dataList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getItemViewType(I)I
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;->dataList:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;

    invoke-virtual {p1}, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;->getShowType()Lcom/sma/smartv3/dto/ChatShowType;

    move-result-object p1

    invoke-virtual {p1}, Lcom/sma/smartv3/dto/ChatShowType;->getFlag()I

    move-result p1

    return p1
.end method

.method public onBindViewHolder(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V
    .locals 2
    .param p1    # Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param

    const-string v0, "holder"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;->getItemViewType()I

    move-result v0

    sget-object v1, Lcom/sma/smartv3/dto/ChatShowType;->FROM:Lcom/sma/smartv3/dto/ChatShowType;

    invoke-virtual {v1}, Lcom/sma/smartv3/dto/ChatShowType;->getFlag()I

    move-result v1

    if-ne v0, v1, :cond_0

    check-cast p1, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter$ChatVoiceFromViewHolder;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;->dataList:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter$ChatVoiceFromViewHolder;->bind(Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;)V

    return-void

    :cond_0
    sget-object v1, Lcom/sma/smartv3/dto/ChatShowType;->TO:Lcom/sma/smartv3/dto/ChatShowType;

    invoke-virtual {v1}, Lcom/sma/smartv3/dto/ChatShowType;->getFlag()I

    move-result v1

    if-ne v0, v1, :cond_1

    check-cast p1, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter$ChatVoiceToViewHolder;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;->dataList:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter$ChatVoiceToViewHolder;->bind(Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;)V

    return-void

    :cond_1
    check-cast p1, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter$ChatVoiceToViewHolder;

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;->dataList:Ljava/util/List;

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;

    invoke-virtual {p1, p2}, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter$ChatVoiceToViewHolder;->bind(Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;)V

    return-void
.end method

.method public onCreateViewHolder(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .locals 2
    .param p1    # Landroid/view/ViewGroup;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
    .end annotation

    const-string v0, "parent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/sma/smartv3/dto/ChatShowType;->FROM:Lcom/sma/smartv3/dto/ChatShowType;

    invoke-virtual {v0}, Lcom/sma/smartv3/dto/ChatShowType;->getFlag()I

    move-result v0

    const-string v1, "createViewHolder(...)"

    if-ne p2, v0, :cond_0

    sget-object p2, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter$onCreateViewHolder$binding$1;->INSTANCE:Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter$onCreateViewHolder$binding$1;

    invoke-static {p0, p1, p2}, Lcom/android/mltcode/paycertificationapi/iXXiX1O1;->OXO1(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function3;)Landroidx/viewbinding/ViewBinding;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/databinding/ItemVoiceChatSendBinding;

    new-instance p2, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter$ChatVoiceFromViewHolder;

    invoke-direct {p2, p0, p1}, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter$ChatVoiceFromViewHolder;-><init>(Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;Lcom/sma/smartv3/databinding/ItemVoiceChatSendBinding;)V

    return-object p2

    :cond_0
    sget-object v0, Lcom/sma/smartv3/dto/ChatShowType;->TO:Lcom/sma/smartv3/dto/ChatShowType;

    invoke-virtual {v0}, Lcom/sma/smartv3/dto/ChatShowType;->getFlag()I

    move-result v0

    if-ne p2, v0, :cond_1

    new-instance p2, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter$ChatVoiceToViewHolder;

    sget-object v0, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter$onCreateViewHolder$1;->INSTANCE:Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter$onCreateViewHolder$1;

    invoke-static {p0, p1, v0}, Lcom/android/mltcode/paycertificationapi/iXXiX1O1;->OXO1(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function3;)Landroidx/viewbinding/ViewBinding;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/databinding/ItemVoiceChatReceiveBinding;

    invoke-direct {p2, p0, p1}, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter$ChatVoiceToViewHolder;-><init>(Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;Lcom/sma/smartv3/databinding/ItemVoiceChatReceiveBinding;)V

    return-object p2

    :cond_1
    new-instance p2, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter$ChatVoiceToViewHolder;

    sget-object v0, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter$onCreateViewHolder$2;->INSTANCE:Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter$onCreateViewHolder$2;

    invoke-static {p0, p1, v0}, Lcom/android/mltcode/paycertificationapi/iXXiX1O1;->OXO1(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function3;)Landroidx/viewbinding/ViewBinding;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/sma/smartv3/databinding/ItemVoiceChatReceiveBinding;

    invoke-direct {p2, p0, p1}, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter$ChatVoiceToViewHolder;-><init>(Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;Lcom/sma/smartv3/databinding/ItemVoiceChatReceiveBinding;)V

    return-object p2
.end method

.method public final setData(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lcom/android/mltcode/paycertificationapi/aa1;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/db/entity/ChatVoiceAssistantMessage;",
            ">;)V"
        }
    .end annotation

    const-string v0, "list"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/ChatVoiceAssistantAdapter;->dataList:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    check-cast p1, Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    return-void
.end method
