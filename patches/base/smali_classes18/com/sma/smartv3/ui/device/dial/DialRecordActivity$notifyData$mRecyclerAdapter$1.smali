.class public final Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$notifyData$mRecyclerAdapter$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->notifyData()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$OXO1;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;ILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;",
            "I",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$OXO1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$notifyData$mRecyclerAdapter$1;->this$0:Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;

    invoke-direct {p0, p1, p2, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$OXO1;I)V
    .locals 11

    const-string p3, "viewHolder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p3, p0, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;->mContext:Landroid/content/Context;

    if-eqz p3, :cond_2

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$notifyData$mRecyclerAdapter$1;->this$0:Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;

    .line 3
    invoke-static {v0, p2, p3, p1}, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;->access$viewHolder(Lcom/sma/smartv3/ui/device/dial/DialRecordActivity;Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$OXO1;Landroid/content/Context;Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    .line 4
    invoke-virtual {v0}, Lcom/bestmafen/androidbase/base/BaseActivity;->getMArg1()I

    move-result p3

    const-string v0, "getView(...)"

    const v1, 0x7f0a08f9

    const/4 v2, 0x4

    if-ne p3, v2, :cond_1

    .line 5
    invoke-virtual {p1, v1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lcom/sma/smartv3/view/ProgressButton;

    const/4 v0, 0x2

    const/4 v1, 0x0

    const v3, 0x7f1404b8

    const/4 v4, 0x0

    invoke-static {p3, v3, v4, v0, v1}, Lcom/sma/smartv3/view/ProgressButton;->O00(Lcom/sma/smartv3/view/ProgressButton;IZILjava/lang/Object;)V

    const p3, 0x7f0a08f8

    .line 6
    invoke-virtual {p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    .line 7
    new-instance p3, Ljava/io/File;

    invoke-virtual {p2}, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$OXO1;->XOO0ii0()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p3, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    const-string p2, "getName(...)"

    invoke-static {v5, p2}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "_"

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object v6

    const/4 v9, 0x6

    const/4 v10, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Lkotlin/text/StringsKt__StringsKt;->i1I(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p2

    .line 8
    move-object p3, p2

    check-cast p3, Ljava/util/Collection;

    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_0

    .line 9
    invoke-static {}, Lcom/android/mltcode/paycertificationapi/XXiO;->OXO1()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 11
    :cond_0
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    return-void

    .line 12
    :cond_1
    invoke-virtual {p1, v1}, Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->O10IXXX0X(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v1, p1

    check-cast v1, Lcom/sma/smartv3/view/ProgressButtonV2;

    const/16 v8, 0x3e

    const/4 v9, 0x0

    const v2, 0x7f1404b8

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v9}, Lcom/sma/smartv3/view/ProgressButtonV2;->IiI10X(Lcom/sma/smartv3/view/ProgressButtonV2;IZIZILjava/lang/String;ILjava/lang/Object;)V

    :cond_2
    return-void
.end method

.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$OXO1;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$notifyData$mRecyclerAdapter$1;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/ui/device/dial/DialRecordActivity$OXO1;I)V

    return-void
.end method
