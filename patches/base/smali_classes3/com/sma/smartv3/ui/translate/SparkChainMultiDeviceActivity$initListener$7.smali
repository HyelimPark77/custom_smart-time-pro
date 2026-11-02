.class public final Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity$initListener$7;
.super Landroidx/activity/OnBackPressedCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity;->initListener()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity;


# direct methods
.method public constructor <init>(Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity$initListener$7;->this$0:Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Landroidx/activity/OnBackPressedCallback;-><init>(Z)V

    return-void
.end method


# virtual methods
.method public handleOnBackPressed()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/activity/OnBackPressedCallback;->setEnabled(Z)V

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity$initListener$7;->this$0:Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity;

    invoke-static {v0}, Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity;->access$getViewModel(Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity;)Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel;->saveAllDataAndExit()V

    iget-object v0, p0, Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity$initListener$7;->this$0:Lcom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity;

    invoke-virtual {v0}, Landroidx/activity/ComponentActivity;->getOnBackPressedDispatcher()Landroidx/activity/OnBackPressedDispatcher;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/activity/OnBackPressedDispatcher;->onBackPressed()V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroidx/activity/OnBackPressedCallback;->setEnabled(Z)V

    return-void
.end method
