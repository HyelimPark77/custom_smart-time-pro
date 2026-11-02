.class public final Lcom/sma/smartv3/ui/device/GameMemberActivity$onInitBaseLayoutAfter$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/android/mltcode/paycertificationapi/O1XIiIO;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/GameMemberActivity;->onInitBaseLayoutAfter()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/android/mltcode/paycertificationapi/O1XIiIO<",
        "Ljava/util/List<",
        "Lcom/tenmeter/smlibrary/entity/SMIconListParent;",
        ">;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nGameMemberActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameMemberActivity.kt\ncom/sma/smartv3/ui/device/GameMemberActivity$onInitBaseLayoutAfter$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,221:1\n774#2:222\n865#2,2:223\n774#2:225\n865#2,2:226\n*S KotlinDebug\n*F\n+ 1 GameMemberActivity.kt\ncom/sma/smartv3/ui/device/GameMemberActivity$onInitBaseLayoutAfter$1\n*L\n72#1:222\n72#1:223,2\n74#1:225\n74#1:226,2\n*E\n"
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGameMemberActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameMemberActivity.kt\ncom/sma/smartv3/ui/device/GameMemberActivity$onInitBaseLayoutAfter$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,221:1\n774#2:222\n865#2,2:223\n774#2:225\n865#2,2:226\n*S KotlinDebug\n*F\n+ 1 GameMemberActivity.kt\ncom/sma/smartv3/ui/device/GameMemberActivity$onInitBaseLayoutAfter$1\n*L\n72#1:222\n72#1:223,2\n74#1:225\n74#1:226,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic OXO1:Lcom/sma/smartv3/ui/device/GameMemberActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/GameMemberActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/GameMemberActivity$onInitBaseLayoutAfter$1;->OXO1:Lcom/sma/smartv3/ui/device/GameMemberActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public OXO1(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tenmeter/smlibrary/entity/SMIconListParent;",
            ">;)V"
        }
    .end annotation

    sget-object v0, Lcom/sma/smartv3/network/Api;->INSTANCE:Lcom/sma/smartv3/network/Api;

    invoke-virtual {v0}, Lcom/sma/smartv3/network/Api;->getBASE_URL()Ljava/lang/String;

    move-result-object v0

    const-string v1, "https://dev.iot-solution.net/kotlinweb"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->XOO0ii0(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    if-eqz p1, :cond_2

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/tenmeter/smlibrary/entity/SMIconListParent;

    invoke-virtual {v3}, Lcom/tenmeter/smlibrary/entity/SMIconListParent;->getIconId()I

    move-result v4

    const/16 v5, 0x54

    if-eq v4, v5, :cond_1

    invoke-virtual {v3}, Lcom/tenmeter/smlibrary/entity/SMIconListParent;->getIconId()I

    move-result v3

    const/16 v4, 0x55

    if-ne v3, v4, :cond_0

    :cond_1
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    move-object v0, v1

    goto :goto_2

    :cond_3
    if-eqz p1, :cond_2

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/tenmeter/smlibrary/entity/SMIconListParent;

    invoke-virtual {v3}, Lcom/tenmeter/smlibrary/entity/SMIconListParent;->getIconId()I

    move-result v4

    const/16 v5, 0x32

    if-eq v4, v5, :cond_5

    invoke-virtual {v3}, Lcom/tenmeter/smlibrary/entity/SMIconListParent;->getIconId()I

    move-result v3

    const/16 v4, 0x34

    if-ne v3, v4, :cond_4

    :cond_5
    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    :goto_2
    sget-object p1, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1:Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;

    iget-object v2, p0, Lcom/sma/smartv3/ui/device/GameMemberActivity$onInitBaseLayoutAfter$1;->OXO1:Lcom/sma/smartv3/ui/device/GameMemberActivity;

    invoke-static {v2}, Lcom/sma/smartv3/ui/device/GameMemberActivity;->access$getTAG$p(Lcom/sma/smartv3/ui/device/GameMemberActivity;)Ljava/lang/String;

    move-result-object v2

    if-eqz v0, :cond_7

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :cond_7
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " getIconLists = "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/android/mltcode/paycertificationapi/i1O0OXO1O;->OXO1(Ljava/lang/String;)V

    iget-object p1, p0, Lcom/sma/smartv3/ui/device/GameMemberActivity$onInitBaseLayoutAfter$1;->OXO1:Lcom/sma/smartv3/ui/device/GameMemberActivity;

    invoke-virtual {p1, v0}, Lcom/sma/smartv3/ui/device/GameMemberActivity;->showList(Ljava/util/List;)V

    return-void
.end method

.method public handleError(Ljava/lang/String;)V
    .locals 1

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/blankj/utilcode/util/ToastUtils;->showLong(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic handleResponse(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/sma/smartv3/ui/device/GameMemberActivity$onInitBaseLayoutAfter$1;->OXO1(Ljava/util/List;)V

    return-void
.end method
