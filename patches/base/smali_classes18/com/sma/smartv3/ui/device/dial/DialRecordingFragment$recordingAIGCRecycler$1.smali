.class public final Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment$recordingAIGCRecycler$1;
.super Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment;->recordingAIGCRecycler()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter<",
        "Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment$OXO1;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment;Landroid/content/Context;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment;",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment$OXO1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment$recordingAIGCRecycler$1;->this$0:Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment;

    const p1, 0x7f0d0eda

    invoke-direct {p0, p2, p1, p3}, Lcom/bestmafen/androidbase/adapter/recyclerview/CommonAdapter;-><init>(Landroid/content/Context;ILjava/util/List;)V

    return-void
.end method


# virtual methods
.method public convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment$OXO1;I)V
    .locals 1

    const-string p3, "viewHolder"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "item"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/Intrinsics;->X0O(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object p3, p0, Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment$recordingAIGCRecycler$1;->this$0:Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment;

    invoke-virtual {p3}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    move-result-object p3

    if-eqz p3, :cond_0

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment$recordingAIGCRecycler$1;->this$0:Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment;

    .line 3
    invoke-virtual {v0, p2, p3, p1}, Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment;->viewHolder(Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment$OXO1;Landroid/content/Context;Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;)Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;

    :cond_0
    return-void
.end method

.method public bridge synthetic convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment$OXO1;

    invoke-virtual {p0, p1, p2, p3}, Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment$recordingAIGCRecycler$1;->convert(Lcom/bestmafen/androidbase/adapter/recyclerview/base/ViewHolder;Lcom/sma/smartv3/ui/device/dial/DialRecordingFragment$OXO1;I)V

    return-void
.end method
