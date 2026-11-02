.class public final Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity$addBackPressedDispatcher$1;
.super Landroidx/activity/OnBackPressedCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->addBackPressedDispatcher()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity$addBackPressedDispatcher$1;->this$0:Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Landroidx/activity/OnBackPressedCallback;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public handleOnBackPressed()V
    .locals 1

    iget-object v0, p0, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity$addBackPressedDispatcher$1;->this$0:Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/device/guide/BaseAppGuideActivity;->onHandleBackPressed()V

    return-void
.end method
